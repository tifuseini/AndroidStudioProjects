package com.example.bootcamplearner.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bootcamplearner.R
import com.example.bootcamplearner.data.LearnerData

class LearnersAdapter(
    private val context:Context,
    private val learnersList : ArrayList<LearnerData>
) : RecyclerView.Adapter<LearnersAdapter.LearnersViewHolder>() {



    class LearnersViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LearnersViewHolder {
        var rootView = LayoutInflater.from(context).inflate(R.layout.learner_title_row,parent,false)
        return LearnersViewHolder(rootView)
    }

    override fun onBindViewHolder(holder: LearnersViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
    
    override fun getItemCount(): Int {
        return learnersList.size
    }
}

