package com.example.ezquiz_sarocha_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_one.*

class one : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)

        b1.setOnClickListener {
            val builder = AlertDialog.Builder(this).apply {
                setTitle("Answer Incorrect !!")
                setMessage("The answer is incorrect.")
                setPositiveButton("next question.",{dialog,which ->
                    val intent = Intent(this@one, two::class.java)
                    startActivity(intent)
                })
            }
            val alertDialog = builder.create()
            alertDialog.show()
        }
        c1.setOnClickListener {
            val builder = AlertDialog.Builder(this).apply {
                setTitle("Answer Incorrect !!")
                setMessage("The answer is incorrect.")
                setPositiveButton("next question.",{dialog,which ->
                    val intent = Intent(this@one, two::class.java)
                    startActivity(intent)
                })
            }
            val alertDialog = builder.create()
            alertDialog.show()
        }
        d1.setOnClickListener {
            val builder = AlertDialog.Builder(this).apply {
                setTitle("Answer Incorrect !!")
                setMessage("The answer is incorrect.")
                setPositiveButton("next question.",{dialog,which ->
                    val intent = Intent(this@one, two::class.java)
                    startActivity(intent)
                })
            }
            val alertDialog = builder.create()
            alertDialog.show()
        }
    }
}