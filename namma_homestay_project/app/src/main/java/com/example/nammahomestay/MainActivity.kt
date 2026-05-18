package com.example.nammahomestay

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.nammahomestay.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bookButton.setOnClickListener {
            binding.statusText.text = "Booking request submitted successfully!"
        }
    }
}