package com.cldstn.deon01bts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image1 = findViewById<ImageView>(R.id.image_001)
        image1.setOnClickListener {

            Toast.makeText(this, "1번 이미지 클릭!", Toast.LENGTH_LONG).show()

            val intent = Intent(this, image001activity::class.java)
            startActivity(intent)
        }

        val image2 = findViewById<ImageView>(R.id.image_002)
        image2.setOnClickListener {
            val intent = Intent(this, image002activity::class.java)
            startActivity(intent)
        }




    }
}