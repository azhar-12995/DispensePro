package com.mtbc.dispensepro.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.mtbc.dispensepro.R
import com.mtbc.dispensepro.databinding.ActivityPhamacyScreenBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PharmacyScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPhamacyScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityPhamacyScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.liRack.setOnClickListener {
            RackDialog().show(supportFragmentManager, "AlphabetDialog")

        }
    }
}