package com.example.regreen

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomepageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_homepage)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun delivered(view: View) {
        val intent = Intent(this, SearchDriverActivity::class.java)
        startActivity(intent)
    }

    fun location(view: View) {
        val intent = Intent(this, LocationActivity::class.java)
        startActivity(intent)
    }

    fun home(view: View) {
        val intent = Intent(this, HomepageActivity::class.java)
        startActivity(intent)
    }


}