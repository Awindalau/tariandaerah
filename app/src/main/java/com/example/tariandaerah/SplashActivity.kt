package com.example.tariandaerah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        splashScreen()
        supportActionBar?.hide()
    }

    fun splashScreen(){
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java)).also { finish() }
        }, 2000)
    }
}
