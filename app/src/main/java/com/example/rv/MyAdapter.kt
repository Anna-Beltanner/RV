package com.example.rv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(private val newsList: ArrayList<Movie>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = newsList[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.heading.text = currentItem.heading

    }

    override fun getItemCount(): Int {
        return newsList.size

    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val titleImage: ShapeableImageView = itemView.findViewById(R.id.title_image)
        val heading: TextView = itemView.findViewById(R.id.heading)



    }
}
