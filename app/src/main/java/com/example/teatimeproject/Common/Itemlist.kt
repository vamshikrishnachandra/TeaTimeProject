package com.example.teatimeproject.Common

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teatimeproject.R
import com.example.teatimeproject.databinding.ActivityItemlistBinding
import com.example.teatimeproject.databinding.ItemlistlistBinding

class Itemlist : AppCompatActivity() {
    private lateinit var binding: ActivityItemlistBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityItemlistBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}