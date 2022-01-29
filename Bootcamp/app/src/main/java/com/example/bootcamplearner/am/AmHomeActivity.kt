package com.example.bootcamplearner.am

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bootcamplearner.R
import com.example.bootcamplearner.adapter.LearnersAdapter
import com.example.bootcamplearner.data.LearnerData
import com.example.bootcamplearner.profileActivity.LearnProfileActivity
import com.example.bootcamplearner.utils.Constant

class AmHomeActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_am_home)

        recyclerView = findViewById(R.id.recyclerViewAM)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val learnersList = ArrayList<LearnerData>()

        learnersList.add(
            LearnerData(
                "Kwadwo Busumtwi","kwadwobusumtwi@gmail.com","Male",
                "Backend Developer","0545644173","Accra",Constant.KWADWO
            )
        )

        learnersList.add(
            LearnerData(
                "Olorunfemi Oyewole","eliasikechi14@gmail.com","Male",
                "Programmer/Graphic Designer","0545565901","Accra",Constant.FEMI
            )
        )

        val adapta = LearnersAdapter(this,learnersList,object :LearnersAdapter.HandleLearnerClick{

            override fun onLearnerClick(position: Int) {
                val learner = learnersList[position]
                val name:String = learner.name
                val email:String = learner.email
                val gender:String = learner.gender
                val phonenumber:String = learner.phone
                val profession:String = learner.profession
                val learnerImag:Int = learner.image


                val intent = Intent(this@AmHomeActivity, LearnProfileActivity::class.java)
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

        recyclerView.adapter = adapta


    }
}