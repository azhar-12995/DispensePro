package com.mtbc.dispensepro.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.mtbc.dispensepro.R
import com.mtbc.dispensepro.adapters.LessonAdapter
import com.mtbc.dispensepro.bottomsheets.LessonBottomSheet
import com.mtbc.dispensepro.databinding.ActivityLessonsBinding
import com.mtbc.dispensepro.lessons.LessonsViewModel
import com.mtbc.dispensepro.model.Lesson
import com.mtbc.dispensepro.showToast
import com.mtbc.dispensepro.utils.Resource
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class LessonsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLessonsBinding
     val lessonsViewModel: LessonsViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityLessonsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        lessonsViewModel.getAllLessons()
        getLessons()

    }
  private fun setLessons(lessons: List<Lesson>) {
      binding.rvLessons.layoutManager = LinearLayoutManager(this)
      binding.rvLessons.adapter = LessonAdapter(lessons, onLessonClick = { lesson ->
          val bottomSheet = LessonBottomSheet(lesson)
          bottomSheet.show(supportFragmentManager, bottomSheet.tag)
      })
  }
    private fun getLessons() {
        lifecycleScope.launch {
            lessonsViewModel.lessons.collectLatest { result ->
                when (result) {
                    is Resource.Loading -> {
                        // Optional: show progress bar
                    }
                    is Resource.Success -> {
                        val lessons = result.data
                        if (!lessons.isNullOrEmpty()) {
                          setLessons(lessons)
                        } else {
                            lessonsViewModel.getAllLessons()
                        }
                    }
                    is Resource.Error -> {
                        showToast(result.message)
                    }
                }
            }
        }
    }

    }
