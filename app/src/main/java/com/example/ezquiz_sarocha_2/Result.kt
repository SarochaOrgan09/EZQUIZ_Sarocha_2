package com.example.ezquiz_sarocha_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ezquiz_sarocha_2.one.Companion.index
import kotlinx.android.synthetic.main.activity_result.*
import kotlin.Result

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var ans = index
        CorrectAns.setText("$ans")
    }

}