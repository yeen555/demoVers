package com.example.ttt

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ttt.databinding.ActivityLevelsBinding

class LevelsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLevelsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLevelsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.levelsB1.setOnClickListener {startActivity(Intent(this,GameActivity::class.java))}
        binding.levelsB2.setOnClickListener {startActivity(Intent(this,GameActivity::class.java))}
        binding.levelsB3.setOnClickListener {startActivity(Intent(this,GameActivity::class.java))}
    }
}