package com.example.ratingbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val click = findViewById<Button>(R.id.button) as Button
        val ratingBar = findViewById<RatingBar>(R.id.rating) as RatingBar

        click.setOnClickListener {
            val ratingBarValue = ratingBar.rating
            Toast.makeText(this@MainActivity,"Rating:-"+ratingBarValue,Toast.LENGTH_SHORT).show()
        }
    }
}