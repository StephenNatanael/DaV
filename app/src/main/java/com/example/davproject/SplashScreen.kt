package com.example.davproject

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_splash.*

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //mengatur layar mana yang akan dibuka
        setContentView(R.layout.activity_splash)

        //mengatur animasi
        logoSplash.alpha = 0f
        logoSplash.animate().setDuration(1500).alpha(1f).withEndAction{
            //mengatur setelah animasi ke intent mana
            val a = Intent(this, MainActivity::class.java)
            startActivity(a)

            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
    }
}