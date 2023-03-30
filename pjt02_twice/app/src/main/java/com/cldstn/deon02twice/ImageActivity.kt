package com.cldstn.deon02twice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class ImageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        val getData = intent.getStringExtra("data")

        val memberImage = findViewById<ImageView>(R.id.whatImage)

        // Toast.makeText(this, getData, Toast.LENGTH_LONG).show()

        if (getData == "1") {
            memberImage.setImageResource(R.drawable.typescript)
        }
        if (getData == "2") {
            memberImage.setImageResource(R.drawable.thumb)
        }
    }
}