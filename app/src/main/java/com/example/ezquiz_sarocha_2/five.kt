package com.example.ezquiz_sarocha_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.ezquiz_sarocha_2.one.Companion.index
import kotlinx.android.synthetic.main.activity_five.*

class five : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five)

        a5.setOnClickListener {
            index++
            val intent = Intent(this@five, six::class.java)
            startActivity(intent)
        }

        b5.setOnClickListener {
            val builder = AlertDialog.Builder(this).apply {
                setTitle("Answer Incorrect !!")
                setMessage("The answer is incorrect.")
                setPositiveButton("next question.",{dialog,which ->
                    val intent = Intent(this@five, six::class.java)
                    startActivity(intent)
                })
            }
            val alertDialog = builder.create()
            alertDialog.show()
        }

        c5.setOnClickListener {
            val builder = AlertDialog.Builder(this).apply {
                setTitle("Answer Incorrect !!")
                setMessage("The answer is incorrect.")
                setPositiveButton("next question.",{dialog,which ->
                    val intent = Intent(this@five, six::class.java)
                    startActivity(intent)
                })
            }
            val alertDialog = builder.create()
            alertDialog.show()
        }

        d5.setOnClickListener {
            val builder = AlertDialog.Builder(this).apply {
                setTitle("Answer Incorrect !!")
                setMessage("The answer is incorrect.")
                setPositiveButton("next question.",{dialog,which ->
                    val intent = Intent(this@five, six::class.java)
                    startActivity(intent)
                })
            }
            val alertDialog = builder.create()
            alertDialog.show()
        }
    }
}