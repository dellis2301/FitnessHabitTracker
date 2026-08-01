package com.example.fitnesshabittracker

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Open Habit Tracker Activity and pass information
        val habitButton = findViewById<Button>(R.id.btnHabit)

        habitButton.setOnClickListener {
            val intent = Intent(this, HabitTrackerActivity::class.java)

            intent.putExtra(
                "app_message",
                "Welcome to your Fitness Habit Tracker!"
            )

            startActivity(intent)
        }

        // Open Preferences Activity
        val preferencesButton = findViewById<Button>(R.id.btnPreferences)

        preferencesButton.setOnClickListener {
            val intent = Intent(this, PreferencesActivity::class.java)
            startActivity(intent)
        }

        // Open Help Activity
        val helpButton = findViewById<Button>(R.id.btnHelp)

        helpButton.setOnClickListener {
            val intent = Intent(this, HelpActivity::class.java)
            startActivity(intent)
        }
    }
}