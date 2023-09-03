package com.example.teatimeproject.Authentication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teatimeproject.Admin.AdminHome
import com.example.teatimeproject.R
import com.example.teatimeproject.databinding.ActivityForgotpasswordBinding
import com.example.teatimeproject.databinding.ActivitySupplierlistBinding

class Forgotpassword : AppCompatActivity() {
    private lateinit var binding: ActivityForgotpasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgotpasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.login.setOnClickListener {
            val intent = Intent(this,Login::class.java)
            startActivity(intent)
        }
        binding.button.setOnClickListener {
            val intent = Intent(this,Login::class.java)
            startActivity(intent)
        }
    }
}