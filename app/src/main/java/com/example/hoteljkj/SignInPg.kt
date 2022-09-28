package com.example.hoteljkj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignInPg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signin_page)

        val signUpButton = findViewById<Button>(R.id.signUp)
        signUpButton.setOnClickListener{
            val intent = Intent(this,RegisterPage::class.java)
            startActivity(intent)
            }

        val signInButton = findViewById<Button>(R.id.signIntwo)
        signInButton.setOnClickListener {
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
        }

    }
}