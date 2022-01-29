package com.example.bootcamplearner.profileActivity

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.bootcamplearner.R

class LearnProfileActivity : AppCompatActivity(){

    private lateinit var name_field :TextView
    private lateinit var email_field:TextView
    private lateinit var gender_field:TextView
    private lateinit var profession_field:TextView
    private lateinit var phone_field:TextView
    private lateinit var location_field:TextView
    private lateinit var image_field:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learner_profile)


        name_field = findViewById(R.id.name_field)
        email_field = findViewById(R.id.email_field)
        gender_field = findViewById(R.id.gender_field)
        profession_field = findViewById(R.id.profession_field)
        phone_field = findViewById(R.id.phone_number)
        location_field = findViewById(R.id.location_field)
        image_field = findViewById(R.id.image)

    }
}