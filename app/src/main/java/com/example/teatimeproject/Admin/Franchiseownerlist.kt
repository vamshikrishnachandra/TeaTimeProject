package com.example.teatimeproject.Admin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teatimeproject.R
import com.example.teatimeproject.databinding.ActivityFranchiseownerlistBinding

class Franchiseownerlist : AppCompatActivity() {
    private lateinit var binding: ActivityFranchiseownerlistBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFranchiseownerlistBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}