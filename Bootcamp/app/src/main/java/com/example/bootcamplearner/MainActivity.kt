package com.example.bootcamplearner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.bootcamplearner.data.LearnerData

class MainActivity : AppCompatActivity() {

    private lateinit var list_recycler:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list_recycler = findViewById(R.id.list_recycler)

    }
}