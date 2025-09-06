package com.mtbc.dispensepro.bottomsheets

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.button.MaterialButton
import com.mtbc.dispensepro.R
import com.mtbc.dispensepro.lessons.LessonsViewModel
import com.mtbc.dispensepro.mcq.McqDialogFragment
import com.mtbc.dispensepro.model.Lesson
import com.mtbc.dispensepro.model.RegisteredLessons
import com.mtbc.dispensepro.showToast
import com.mtbc.dispensepro.showYesNoDialog
import com.mtbc.dispensepro.utils.LoaderDialog
import com.mtbc.dispensepro.utils.Resource
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class LessonBottomSheet(
    private val lesson: Lesson,
    val lessonsViewModel: LessonsViewModel,
    val uid: String,
    val loader: LoaderDialog
) : BottomSheetDialogFragment() {

    override fun getTheme(): Int = R.style.TransparentBottomSheetDialog
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.bottom_sheet_lesson, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val lessonTitle = view.findViewById<TextView>(R.id.tvLessonTitle)
        val lessonInfo = view.findViewById<TextView>(R.id.tvLessonInfo)
        val ivRegister = view.findViewById<ImageView>(R.id.ivRegister)
        val btnStartLesson = view.findViewById<MaterialButton>(R.id.btnStartLesson)

        lessonsViewModel.isCourseRegister(uid,lesson.id.toString())


        lifecycleScope.launch {
            lessonsViewModel.isRegistered.collectLatest { result ->
                when (result) {
                    is Resource.Loading -> {

                    }
                    is Resource.Success -> {
                        if (result.data) {
                            ivRegister.visibility = View.GONE
                        } else {
                            ivRegister.visibility = View.VISIBLE
                        }
                    }
                    is Resource.Error -> {

                        requireActivity().showToast(result.message)
                    }

                    Resource.Idle -> {

                    }
                }
            }

        }
        lifecycleScope.launch {
            lessonsViewModel.registerCourse.collectLatest { result ->
                when (result) {
                    is Resource.Loading -> {
                       loader.show()
                    }
                    is Resource.Success -> {
                        loader.hide()
                        requireActivity().showToast("Course Registered Successfully")
                        lessonsViewModel._registerCourse.value = Resource.Idle
                    }
                    is Resource.Error -> {
                        loader.hide()
                        requireActivity().showToast(result.message)
                    }

                    Resource.Idle -> {

                    }
                }
            }

        }

        lessonTitle.text = lesson.title
        lessonInfo.text = lesson.info
        ivRegister.setOnClickListener {
            requireActivity().showYesNoDialog("Would you like to Register Course", "Yes", "No", {
                lessonsViewModel.registerAndUpdateCourse(
                    uid, RegisteredLessons(lesson.id, false, true, 0.0, 0.0, 0.0)
                )
            }, {
                // Handle No button click
                dismiss()
            })

        }
        btnStartLesson.setOnClickListener {
            val dialog = McqDialogFragment.newInstance(lesson,uid,lessonsViewModel)
            dialog.show(parentFragmentManager, "mcqDialog")
            dismiss()
        }
    }
}