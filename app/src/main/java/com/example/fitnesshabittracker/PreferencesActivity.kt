package com.example.fitnesshabittracker

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PreferencesActivity : AppCompatActivity() {

    private lateinit var notificationsCheckBox: CheckBox
    private lateinit var remindersCheckBox: CheckBox
    private lateinit var saveButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preferences)

        notificationsCheckBox = findViewById(R.id.cbNotifications)
        remindersCheckBox = findViewById(R.id.cbReminders)
        saveButton = findViewById(R.id.btnSave)

        val prefs = getSharedPreferences("FitnessPrefs", Context.MODE_PRIVATE)

        // Load saved preferences (default = true)
        notificationsCheckBox.isChecked =
            prefs.getBoolean("notifications", true)

        remindersCheckBox.isChecked =
            prefs.getBoolean("reminders", true)

        saveButton.setOnClickListener {

            val editor = prefs.edit()

            editor.putBoolean(
                "notifications",
                notificationsCheckBox.isChecked
            )

            editor.putBoolean(
                "reminders",
                remindersCheckBox.isChecked
            )

            editor.apply()

            Toast.makeText(
                this,
                "Preferences Saved",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}