package com.example.teatimeproject.Admin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teatimeproject.R
import com.example.teatimeproject.databinding.ActivityAddFranchiseBinding
import com.example.teatimeproject.databinding.ActivityAdditemBinding

class Additem : AppCompatActivity() {
    private lateinit var binding: ActivityAdditemBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_additem)
        binding = ActivityAdditemBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}