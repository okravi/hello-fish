package com.example.helloworld

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to button
        val btnClickMe = findViewById(R.id.button) as Button
        val mytextView = findViewById(R.id.textView) as TextView
        var timesClicked = 0
// set on-click listener
        btnClickMe.setOnClickListener {
            timesClicked += 1
            mytextView.text = timesClicked.toString()
            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
        }
    }
}