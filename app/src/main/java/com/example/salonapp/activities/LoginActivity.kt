package com.example.salonapp.activities

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.salonapp.R

class LoginActivity : AppCompatActivity() {

    val TAG = "LoginActivity"
    private lateinit var singup_link: TextView
    private lateinit var register_salon_link: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_screen)

        singup_link = findViewById(R.id.signup_link)
        register_salon_link = findViewById(R.id.register_salon_link)

        singup_link.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }

        register_salon_link.setOnClickListener {
            val intent = Intent(this, TermsAndConditionsActivity::class.java)
            startActivity(intent)
        }


    }
}