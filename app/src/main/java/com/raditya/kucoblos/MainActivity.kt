package com.raditya.kucoblos

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.raditya.kucoblos.fragments.HomeFragment

class MainActivity : AppCompatActivity() {
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        handler= Handler()
        handler.postDelayed({
            val intent = Intent(this,SplashScreen_activity::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
}