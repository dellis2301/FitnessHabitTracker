package com.example.fitnesshabittracker

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HabitTrackerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_habit_tracker)

        val messageText = findViewById<TextView>(R.id.txtMessage)

        val message = intent.getStringExtra("app_message")

        if (message != null) {
            messageText.text = message
        }
    }
}