package com.inwis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.inwis.onboarding.OnBoardActivity

class SplashScreenActivity : AppCompatActivity() {
    private val SPLASH : Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
            startActivity(Intent(this,OnBoardActivity::class.java))
        },SPLASH)
    }
}