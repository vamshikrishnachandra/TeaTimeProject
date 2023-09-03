package com.example.teatimeproject.Supplier

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teatimeproject.R
import com.example.teatimeproject.databinding.ActivitySupplierHomeBinding

class Supplierhome : AppCompatActivity() {
    private lateinit var binding:ActivitySupplierHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySupplierHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}