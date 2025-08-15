package com.mtbc.dispensepro.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.mtbc.dispensepro.adapters.BadgesAdapter
import com.mtbc.dispensepro.R
import com.mtbc.dispensepro.databinding.ActivityAllBadgesBinding
import com.mtbc.dispensepro.model.Badges
import com.mtbc.dispensepro.utils.BadgeViewType

class AllBadgesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAllBadgesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityAllBadgesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        setBadges()
    }
    private fun setBadges() {

        binding.rvAllBadges.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val itemList = listOf(
            Badges(R.drawable.ic_launcher_background, "Item 1"),
            Badges(R.drawable.ic_launcher_background, "Item 2"),
            Badges(R.drawable.ic_launcher_background, "Item 3"),
            Badges(R.drawable.ic_launcher_background, "Item 4"),
            Badges(R.drawable.ic_launcher_background, "Item 5"),
            Badges(R.drawable.ic_launcher_background, "Item 6"),
            Badges(R.drawable.ic_launcher_background, "Item 7")
        )
        binding.rvAllBadges.adapter = BadgesAdapter(itemList,BadgeViewType.ALL_BADGES_SCREEN)
    }
}