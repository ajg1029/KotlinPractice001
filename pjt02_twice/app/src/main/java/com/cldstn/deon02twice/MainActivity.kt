package com.cldstn.deon02twice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<ImageView>(R.id.img01)
        val btn2 = findViewById<ImageView>(R.id.img02)
        val btn3 = findViewById<ImageView>(R.id.img03)
        val btn4 = findViewById<ImageView>(R.id.img04)
        val btn5 = findViewById<ImageView>(R.id.img05)
        val btn6 = findViewById<ImageView>(R.id.img06)
        val btn7 = findViewById<ImageView>(R.id.img07)
        val btn8 = findViewById<ImageView>(R.id.img08)
        val btn9 = findViewById<ImageView>(R.id.img09)

        btn1.setOnClickListener {
            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("data", "1")
            startActivity(intent)
        }

        btn2.setOnClickListener {
            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("data", "2")
            startActivity(intent)
        }

    }
}