package com.mtbc.dispensepro.bottomsheets

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.mtbc.dispensepro.R
import com.mtbc.dispensepro.model.Lesson

class LessonBottomSheet(private val lesson: Lesson) : BottomSheetDialogFragment() {

    override fun getTheme(): Int = R.style.TransparentBottomSheetDialog
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.bottom_sheet_lesson, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val lessonTitle = view.findViewById<TextView>(R.id.tvLessonTitle)
        val lessonInfo = view.findViewById<TextView>(R.id.tvLessonInfo)
        val ivRegister = view.findViewById<ImageView>(R.id.ivRegister)
        lessonTitle.text = lesson.title
        lessonInfo.text = lesson.info
        ivRegister.setOnClickListener {

            dismiss()
        }

        // add other views/actions here if needed
    }
}