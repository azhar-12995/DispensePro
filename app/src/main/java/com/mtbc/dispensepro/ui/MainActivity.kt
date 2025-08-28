package com.mtbc.dispensepro.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.mtbc.dispensepro.adapters.BadgesAdapter
import com.mtbc.dispensepro.R
import com.mtbc.dispensepro.authentication.StorageManager
import com.mtbc.dispensepro.databinding.ActivityMainBinding
import com.mtbc.dispensepro.lessons.LessonsViewModel
import com.mtbc.dispensepro.lessons.StaticLessonProvider.getAllLessons
import com.mtbc.dispensepro.model.Badges
import com.mtbc.dispensepro.model.Lesson
import com.mtbc.dispensepro.model.RegisteredLessons
import com.mtbc.dispensepro.moveToNextActivity
import com.mtbc.dispensepro.showToast
import com.mtbc.dispensepro.utils.BadgeViewType
import com.mtbc.dispensepro.utils.Resource
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var lessonsViewModel: LessonsViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
       binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        lessonsViewModel = ViewModelProvider(this)[LessonsViewModel::class.java]
        lessonsViewModel.getAllLessons()
        getAllLessonsCount()
        lessonsViewModel.registerCourse(
            StorageManager.getUserId(applicationContext)!!, RegisteredLessons(1, false, true, 0.0, 0.0, 0.0)
        )

        binding.tvViewAll.setOnClickListener {
            moveToNextActivity(AllBadgesActivity::class.java)
        }
        binding.cardNewCourses.setOnClickListener {
            moveToNextActivity(LessonsActivity::class.java)
        }
        if (!StorageManager.isLessonsInitialized(this)) {
            lessonsViewModel.addLessons(getAllLessons())
            StorageManager.markLessonsAsInitialized(this)
        }

        setBadges()

    }



    fun getAllLessonsCount(){
        lifecycleScope.launch {
            lessonsViewModel.lessons.collectLatest { response ->
                when(response){

                    is Resource.Loading -> {

                    }
                    is Resource.Success -> {
                        val lessons = response.data
                        if (!lessons.isNullOrEmpty()) {
                            binding.tvNewCourses.text = "All Courses\n    "+lessons.size.toString()
                        } else {
                            lessonsViewModel.getAllLessons()
                        }

                    }

                    is Resource.Error -> {
                        showToast(response.message)
                    }
                    Resource.Idle -> {

                    }
                }
            }
        }
    }

    private fun setBadges() {

        binding.rvBagdes.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val itemList = listOf(
            Badges(R.drawable.ic_launcher_background, "Item 1"),
            Badges(R.drawable.ic_launcher_background, "Item 2"),
            Badges(R.drawable.ic_launcher_background, "Item 3"),
            Badges(R.drawable.ic_launcher_background, "Item 4"),
            Badges(R.drawable.ic_launcher_background, "Item 5"),
            Badges(R.drawable.ic_launcher_background, "Item 6"),
            Badges(R.drawable.ic_launcher_background, "Item 7")
        )
        binding.rvBagdes.adapter = BadgesAdapter(itemList, BadgeViewType.MAIN_SCREEN)
    }
}