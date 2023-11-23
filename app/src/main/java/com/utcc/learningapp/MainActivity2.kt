package com.utcc.learningapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnRegisterToLoginPage = findViewById<Button>(R.id.btnRegister)

        btnRegisterToLoginPage.setOnClickListener {
            val intentToLoginPage = Intent(this@MainActivity2, MainActivity::class.java)
            startActivity(intentToLoginPage)
        }

    }
}