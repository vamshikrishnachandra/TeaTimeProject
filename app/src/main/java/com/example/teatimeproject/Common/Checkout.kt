package com.example.teatimeproject.Common

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teatimeproject.R
import com.example.teatimeproject.databinding.ActivityCheckoutBinding

class Checkout : AppCompatActivity() {
    private lateinit var binding: ActivityCheckoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCheckoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}