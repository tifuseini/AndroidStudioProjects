package com.example.bootcamplearner.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.bootcamplearner.R
import com.example.bootcamplearner.data.LearnerData

class LearnersAdapter(
    private val context: Context,
    private val learnersList: ArrayList<LearnerData>,
    private val handleLearnerClick: HandleLearnerClick
) : RecyclerView.Adapter<LearnersAdapter.LearnersViewHolder>() {



    class LearnersViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.name_field)
        val Image: ImageView = itemView.findViewById(R.id.image)
        val learnerClick : CardView = itemView.findViewById(R.id.relativeLayout)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LearnersViewHolder {
        val rootView = LayoutInflater.from(context).inflate(R.layout.learner_title_row,parent,false)
        return LearnersViewHolder(rootView)
    }

    interface HandleLearnerClick{
        fun onLearnerClick(position: Int)
    }

    override fun onBindViewHolder(holder: LearnersViewHolder, position: Int) {
        val dataPosition = learnersList[position]
        holder.name.text = dataPosition.name


        holder.learnerClick.setOnClickListener {
            handleLearnerClick.onLearnerClick(position)
        }






    }
    
    override fun getItemCount(): Int {
        return learnersList.size
    }
}

