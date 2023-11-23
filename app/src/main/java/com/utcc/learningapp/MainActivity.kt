package com.utcc.learningapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Thread.sleep(1500)
        installSplashScreen()

        setContentView(R.layout.activity_main)

        val btnLoginToHomePage = findViewById<Button>(R.id.btnLoginPage)
        val btnCreateAccountToRegisterPage = findViewById<Button>(R.id.btnCreateAccountLoginPage)

        btnLoginToHomePage.setOnClickListener {
            val intentToHomePage = Intent(this@MainActivity, MainActivity3::class.java)
            startActivity(intentToHomePage)
        }
        btnCreateAccountToRegisterPage.setOnClickListener {
            val intentToRegisterPage = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intentToRegisterPage)
        }

    }
}