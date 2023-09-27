package com.example.lab1helloworld

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val displayedText = findViewById<TextView>(R.id.displayedText)
        val buttonTextChanger = findViewById<Button>(R.id.buttonTextChanger)
        val buttonColorChanger = findViewById<Button>(R.id.buttonColorChanger)

        buttonTextChanger.setOnClickListener {
            displayedText.text = getString(R.string.changed_text)
        }

        buttonColorChanger.setOnClickListener {
            displayedText.setTextColor(Color.parseColor("#008000"))
        }
    }
}