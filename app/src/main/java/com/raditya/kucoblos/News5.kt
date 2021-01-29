package com.raditya.kucoblos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog

class News5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news5)
    }
    override fun onBackPressed() {
        var dialog = AlertDialog.Builder(this)
            .setMessage("Apakah Anda Yakin???")
            .setPositiveButton("Ya"){dialog, which ->
                super.onBackPressed()
            }
            .setNegativeButton("Tidak"){dialog, which ->  }
        dialog.show()
    }
}