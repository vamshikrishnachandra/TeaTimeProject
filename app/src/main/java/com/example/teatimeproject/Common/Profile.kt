package com.example.teatimeproject.Common

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teatimeproject.R
import com.example.teatimeproject.databinding.ActivityProfileBinding

class Profile : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}