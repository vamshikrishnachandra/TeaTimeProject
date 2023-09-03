package com.example.teatimeproject.Admin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.teatimeproject.R
import com.example.teatimeproject.databinding.ActivityAddFranchiseBinding

class AddFranchise : AppCompatActivity() {
    //declaration
    private lateinit var binding: ActivityAddFranchiseBinding
    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        binding = ActivityAddFranchiseBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    //functions
}