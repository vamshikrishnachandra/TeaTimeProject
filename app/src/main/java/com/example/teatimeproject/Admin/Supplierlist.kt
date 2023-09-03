package com.example.teatimeproject.Admin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teatimeproject.R
import com.example.teatimeproject.databinding.ActivitySupplierlistBinding

class Supplierlist : AppCompatActivity() {
    private lateinit var binding: ActivitySupplierlistBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySupplierlistBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}