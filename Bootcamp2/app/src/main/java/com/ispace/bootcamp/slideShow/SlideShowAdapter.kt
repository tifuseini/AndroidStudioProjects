package com.ispace.bootcamp.slideShow

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ispace.bootcamp.R

class SlideShowAdapter(private val slideShow: List<SlideShow>)
    : RecyclerView.Adapter<SlideShowAdapter.SlideShowViewHolder>(){

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SlideShowAdapter.SlideShowViewHolder {
        return SlideShowViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.slideshowcontainer,
                parent,false
            )
        )
    }

    override fun getItemCount(): Int {
        return slideShow.size
    }

    override fun onBindViewHolder(holder: SlideShowViewHolder, position: Int) {
        holder.bind(slideShow[position])
    }

    inner class SlideShowViewHolder(view:View):RecyclerView.ViewHolder(view) {
        private val textTitle = view.findViewById<TextView>(R.id.textTitle)
        private val textDescription = view.findViewById<TextView>(R.id.textDes)

        fun bind(slideShow: SlideShow){
            textTitle.text = slideShow.title
            textDescription.text = slideShow.description
        }
    }


}

