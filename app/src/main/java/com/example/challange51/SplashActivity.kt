package com.example.challange51

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    private lateinit var mp : MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        mp = MediaPlayer.create(this, R.raw.introgame)
        mp.start()
        Log.d("SPLAH SCREEN","SPLASH SCREEN")
        mp.setOnCompletionListener {
            val intent = Intent(this, LandingActivity::class.java)
            startActivity(intent)
            finish()
            mp.stop()
        }
    }
}
