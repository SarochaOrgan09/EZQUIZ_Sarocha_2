package com.example.ezquiz_sarocha_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_one.*

class one : AppCompatActivity() {
    companion object{
        var index = 0
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)

        a1.setOnClickListener {
             index++
            val intent = Intent(this@one, two::class.java)
            startActivity(intent)
        }

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