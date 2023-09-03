package com.example.teatimeproject.Supplier

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teatimeproject.R
import com.example.teatimeproject.databinding.ActivityAddSuplieritemBinding

class AddSupplieritem : AppCompatActivity() {
    private lateinit var binding: ActivityAddSuplieritemBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddSuplieritemBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}