package com.mtbc.dispensepro.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.mtbc.dispensepro.R
import com.mtbc.dispensepro.adapters.LessonAdapter
import com.mtbc.dispensepro.authentication.AuthViewModel
import com.mtbc.dispensepro.authentication.StorageManager
import com.mtbc.dispensepro.bottomsheets.LessonBottomSheet
import com.mtbc.dispensepro.databinding.ActivityLessonsBinding
import com.mtbc.dispensepro.lessons.LessonsViewModel
import com.mtbc.dispensepro.model.Lesson
import com.mtbc.dispensepro.model.RegisteredLessons
import com.mtbc.dispensepro.moveToNextActivity
import com.mtbc.dispensepro.showToast
import com.mtbc.dispensepro.utils.LoaderDialog
import com.mtbc.dispensepro.utils.Resource
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class LessonsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLessonsBinding
    private lateinit var loader: LoaderDialog
    private var allRegisteredLessons: List<RegisteredLessons> = emptyList()
    val lessonsViewModel: LessonsViewModel by viewModels()
    val authViewModel: AuthViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityLessonsBinding.inflate(layoutInflater)
        loader = LoaderDialog(this)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

          binding.btnPharmacy.setOnClickListener {
              moveToNextActivity(PharmacyScreenActivity::class.java)
          }
        getLessons()
        getAllRegisteredLessons()

    }

    private fun setLessons(lessons: List<Lesson>) {
        // Build lookup map for faster access
        val registeredMap = allRegisteredLessons.associateBy { it.id }

        var previousCompleted = true // first lesson should always be unlocked

        val updatedLessons = lessons.mapIndexed { index, lesson ->
            val registered = registeredMap[lesson.id]

            lesson.apply {
                // lesson is completed if registered & marked completed
                isCompleted = registered?.isCompleted == true
                marks = registered?.quizMarks ?: 0.0

                // unlocking logic
                locked = when {
                    index == 0 -> false // first lesson always unlocked
                    previousCompleted -> false // unlocked if previous completed
                    else -> true
                }

                // update tracker for the next lesson
                previousCompleted = isCompleted
            }
        }

        binding.rvLessons.apply {
            layoutManager = LinearLayoutManager(this@LessonsActivity)
            adapter = LessonAdapter(updatedLessons) { lesson ->
                if (!lesson.isCompleted) {
                    LessonBottomSheet(
                        lesson,
                        lessonsViewModel,
                        authViewModel.getCurrentUser()!!.uid,
                        loader
                    ).show(supportFragmentManager, LessonBottomSheet::class.java.simpleName)
                }
            }
        }
    }


    private fun getLessons() {
        lifecycleScope.launch {
            lessonsViewModel.lessons.collectLatest { result ->
                when (result) {
                    is Resource.Loading -> {
                        loader.show()
                    }

                    is Resource.Success -> {
                        loader.hide()
                        val lessons = result.data
                        if (!lessons.isNullOrEmpty()) {
                            setLessons(lessons)
                        } else {
                            lessonsViewModel.getAllLessons()
                        }
                    }

                    is Resource.Error -> {
                        loader.hide()
                        showToast(result.message)
                    }

                    Resource.Idle -> {

                    }
                }
            }
        }
    }

    fun getAllRegisteredLessons() {
        lessonsViewModel.getAllRegisteredLessons(StorageManager.getUserId(applicationContext)!!)
        lifecycleScope.launch {
            lessonsViewModel.registeredLessons.collectLatest { result ->
                when (result) {
                    is Resource.Idle -> { /* nothing yet */ }
                    is Resource.Loading -> {

                    }
                    is Resource.Success -> {
                        allRegisteredLessons = result.data
                        lessonsViewModel.getAllLessons()
                    }
                    is Resource.Error -> {
                        showToast(result.message)
                    }
                }
            }
        }
    }

}
