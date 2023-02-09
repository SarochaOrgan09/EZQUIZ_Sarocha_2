package com.example.ezquiz_sarocha_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.ezquiz_sarocha_2.one.Companion.index
import kotlinx.android.synthetic.main.activity_ten.*

class ten : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ten)

        a10.setOnClickListener {
            index++
            val intent = Intent(this@ten, Result::class.java)
            startActivity(intent)
        }

        b10.setOnClickListener {
            val builder = AlertDialog.Builder(this).apply {
                setTitle("Answer Incorrect !!")
                setMessage("The answer is incorrect.")
                setPositiveButton("next question.",{dialog,which ->
                    val intent = Intent(this@ten, Result::class.java)
                    startActivity(intent)
                })
            }
            val alertDialog = builder.create()
            alertDialog.show()
        }

        c10.setOnClickListener {
            val builder = AlertDialog.Builder(this).apply {
                setTitle("Answer Incorrect !!")
                setMessage("The answer is incorrect.")
                setPositiveButton("next question.",{dialog,which ->
                    val intent = Intent(this@ten, Result::class.java)
                    startActivity(intent)
                })
            }
            val alertDialog = builder.create()
            alertDialog.show()
        }

        d10.setOnClickListener {val builder = AlertDialog.Builder(this).apply {
            setTitle("Answer Incorrect !!")
            setMessage("The answer is incorrect.")
            setPositiveButton("next question.",{dialog,which ->
                val intent = Intent(this@ten, Result::class.java)
                startActivity(intent)
            })
        }
            val alertDialog = builder.create()
            alertDialog.show()
        }
    }
}