package com.example.teatimeproject.Admin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teatimeproject.R
import com.example.teatimeproject.databinding.ActivityAddSuplierBinding

class AddSuplier : AppCompatActivity() {
    //declarations
    private lateinit var binding: ActivityAddSuplierBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddSuplierBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //intialization/
    }
    //functions
}