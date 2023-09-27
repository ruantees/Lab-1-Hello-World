package com.example.lab1helloworld

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

        buttonTextChanger.setOnClickListener {
            displayedText.text = getString(R.string.changed_text)
        }
    }
}