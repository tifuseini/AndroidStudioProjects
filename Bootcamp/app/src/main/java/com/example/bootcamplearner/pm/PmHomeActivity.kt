package com.example.bootcamplearner.pm

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.provider.SyncStateContract
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bootcamplearner.R
import com.example.bootcamplearner.adapter.LearnersAdapter
import com.example.bootcamplearner.data.LearnerData
import com.example.bootcamplearner.profileActivity.LearnProfileActivity
import com.example.bootcamplearner.utils.Constant

class PmHomeActivity : AppCompatActivity(){
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_pm_home)

        recyclerView = findViewById(R.id.recyclerViewPM)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val learnersList = ArrayList<LearnerData>()

        learnersList.add(
            LearnerData(
                "Claudia","Mintogo",
                "Female","Student","0269384159","Awoshie",Constant.CLAUDIA)
        )

        val adapta = LearnersAdapter(this,learnersList,object : LearnersAdapter.HandleLearnerClick{

            override fun onLearnerClick(position: Int) {
                val learner = learnersList[position]
                val name:String = learner.name
                val email:String = learner.email
                val gender:String = learner.gender
                val phonenumber:String = learner.phone
                val profession:String = learner.profession
                val learnerImag:Int = learner.image


                val intent = Intent(this@PmHomeActivity, LearnProfileActivity::class.java)
                intent.putExtra("name",name)
                intent.putExtra("email",email)
                intent.putExtra("gender",gender)
                intent.putExtra("phone",phonenumber)
                intent.putExtra("profession",profession)
                intent.putExtra("learnerImg", learnerImag)
                intent.putExtra("AM","AM")
                startActivity(intent)
            }
        })
    }
}