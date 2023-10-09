package com.example.clas999lesson11

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "show first", Toast.LENGTH_LONG).show()
        Toast.makeText(this, "Feature second", Toast.LENGTH_LONG).show()
        Toast.makeText(this, "Feature three", Toast.LENGTH_LONG).show()

    }
}