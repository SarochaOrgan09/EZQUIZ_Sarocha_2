package com.example.ezquiz_sarocha_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.ezquiz_sarocha_2.one.Companion.index
import kotlinx.android.synthetic.main.activity_two.*

class two : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        a2.setOnClickListener {
            val builder = AlertDialog.Builder(this).apply {
                setTitle("Answer Incorrect !!")
                setMessage("The answer is incorrect.")
                setPositiveButton("next question.",{dialog,which ->
                    val intent = Intent(this@two, three::class.java)
                    startActivity(intent)
                })
            }
            val alertDialog = builder.create()
            alertDialog.show()
        }

        b2.setOnClickListener {
            val builder = AlertDialog.Builder(this).apply {
                setTitle("Answer Incorrect !!")
                setMessage("The answer is incorrect.")
                setPositiveButton("next question.",{dialog,which ->
                    val intent = Intent(this@two, three::class.java)
                    startActivity(intent)
                })
            }
            val alertDialog = builder.create()
            alertDialog.show()
        }

        c2.setOnClickListener {
           index++
            val intent = Intent(this@two, three::class.java)
            startActivity(intent)
        }

        d2.setOnClickListener {
            val builder = AlertDialog.Builder(this).apply {
                setTitle("Answer Incorrect !!")
                setMessage("The answer is incorrect.")
                setPositiveButton("next question.",{dialog,which ->
                    val intent = Intent(this@two, three::class.java)
                    startActivity(intent)
                })
            }
            val alertDialog = builder.create()
            alertDialog.show()
        }
    }
}