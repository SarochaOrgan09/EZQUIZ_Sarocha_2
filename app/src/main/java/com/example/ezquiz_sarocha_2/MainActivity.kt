package com.example.ezquiz_sarocha_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start.setOnClickListener{
            val intent = Intent(this@MainActivity, one::class.java)
            startActivity(intent)
        }
    }
}