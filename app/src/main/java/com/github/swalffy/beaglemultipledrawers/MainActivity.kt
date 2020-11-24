package com.github.swalffy.beaglemultipledrawers

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.swalffy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .replace(android.R.id.content, FirstFragment())
            .commitAllowingStateLoss()
    }
}