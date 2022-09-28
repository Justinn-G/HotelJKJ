package com.example.hoteljkj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_page)

        val signInButton = findViewById<Button>(R.id.signIn)
        signInButton.setOnClickListener{
            val intent = Intent(this,SignInPg::class.java)
            startActivity(intent)
        }

        val signInButton2 = findViewById<Button>(R.id.signIn2)
        signInButton2.setOnClickListener {
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
        }

    }
}