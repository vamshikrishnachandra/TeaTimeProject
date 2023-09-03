package com.example.teatimeproject.Common

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teatimeproject.R
import com.example.teatimeproject.databinding.ActivityOlistBinding

class Olist : AppCompatActivity() {
    private lateinit var binding: ActivityOlistBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityOlistBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        //olist-orderlist
    }
}