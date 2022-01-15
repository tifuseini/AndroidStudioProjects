package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var gameScoreTextView: TextView
    private lateinit var timeLeftTextView : TextView
    private lateinit var tapMeButton : Button
    private var score = 0
    private var gameStarted = false

    private lateinit var countDownTimer: CountDownTimer
    private var initialCountDownTimer:Long = 6000
    private var countDownInterval:Long = 1000
    private var timeLeft = 60

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gameScoreTextView = findViewById(R.id.game_score_text_view)
        timeLeftTextView = findViewById(R.id.time_left_text_view)
        tapMeButton = findViewById(R.id.tap_me_button)

        tapMeButton.setOnClickListener { incrementScore() }
    }

    private fun incrementScore(){

        score++
        val newScore = getString(R.string.your_score,score)
        gameScoreTextView.text = newScore

    }

    private fun resetGame(){
        score = 0

        val initialScore = getString(R.string.your_score,score)
        gameScoreTextView.text = initialScore

        val initialTimeLeft = getString(R.string.time_left,60)
        timeLeftTextView.text = initialTimeLeft

        countDownTimer = object : CountDownTimer(I)

    }

    private fun startGame(){

    }

    private fun endGame(){

    }
}