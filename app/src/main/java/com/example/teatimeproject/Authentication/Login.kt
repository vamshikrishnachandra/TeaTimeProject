package com.example.teatimeproject.Authentication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teatimeproject.Admin.AdminHome
import com.example.teatimeproject.R
import com.example.teatimeproject.Supplier.Supplierhome
import com.example.teatimeproject.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.login.setOnClickListener {
            val intent = Intent(this, AdminHome::class.java)
            startActivity(intent)
        }
        binding.forgotpassword.setOnClickListener {
            val intent = Intent(this,Supplierhome::class.java)
        }
    }
}