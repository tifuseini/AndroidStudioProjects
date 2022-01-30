package com.example.helloworld

import android.os.Bundle
import android.widget.TextView
import android.content.Intent
import android.provider.AlarmClock.EXTRA_MESSAGE
import androidx.appcompat.app.AppCompatActivity

class DisplayMessageActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        val message = intent.getStringExtra(EXTRA_MESSAGE)

        val showMessage = findViewById<TextView>(R.id.showMessage).apply {
            text = message
        }
    }

}