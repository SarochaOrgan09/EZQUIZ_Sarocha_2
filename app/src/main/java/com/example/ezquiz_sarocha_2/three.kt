package com.example.ezquiz_sarocha_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.ezquiz_sarocha_2.one.Companion.index
import kotlinx.android.synthetic.main.activity_three.*

class three : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)

        a3.setOnClickListener {
            val builder = AlertDialog.Builder(this).apply {
                setTitle("Answer Incorrect !!")
                setMessage("The answer is incorrect.")
                setPositiveButton("next question.",{dialog,which ->
                    val intent = Intent(this@three, four::class.java)
                    startActivity(intent)
                })
            }
            val alertDialog = builder.create()
            alertDialog.show()
        }

        b3.setOnClickListener {
            index++
            val intent = Intent(this@three, four::class.java)
            startActivity(intent)
        }

        c3.setOnClickListener {
            val builder = AlertDialog.Builder(this).apply {
                setTitle("Answer Incorrect !!")
                setMessage("The answer is incorrect.")
                setPositiveButton("next question.",{dialog,which ->
                    val intent = Intent(this@three, four::class.java)
                    startActivity(intent)
                })
            }
            val alertDialog = builder.create()
            alertDialog.show()
        }

        d3.setOnClickListener {
            val builder = AlertDialog.Builder(this).apply {
                setTitle("Answer Incorrect !!")
                setMessage("The answer is incorrect.")
                setPositiveButton("next question.",{dialog,which ->
                    val intent = Intent(this@three, four::class.java)
                    startActivity(intent)
                })
            }
            val alertDialog = builder.create()
            alertDialog.show()
        }
    }
}