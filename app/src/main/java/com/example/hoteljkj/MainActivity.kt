package com.example.hoteljkj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.landingpage)

        val signInButton = findViewById<Button>(R.id.signIn)
        signInButton.setOnClickListener{
            val intent = Intent(this,SignInPg::class.java)
            startActivity(intent)
        }

        val signUpButton = findViewById<Button>(R.id.signUp)
        signUpButton.setOnClickListener {
            val intent = Intent(this, RegisterPage::class.java)
            startActivity(intent)
        }
    }
}

