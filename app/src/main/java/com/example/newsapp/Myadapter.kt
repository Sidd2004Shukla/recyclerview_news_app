package com.example.newsapp

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.databinding.CustomBinding

class Myadapter(var context: Activity, var newsArray: ArrayList<data>) : RecyclerView.Adapter<Myadapter.ViewHolder>() {



    inner class ViewHolder(var binding: CustomBinding):RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var itemview=CustomBinding.inflate(LayoutInflater.from(context),parent,false)
        return ViewHolder(itemview)
    }

    override fun getItemCount(): Int {
       return newsArray.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val current=newsArray[position]
        holder.binding.tv1.text=current.news
        holder.binding.iv1.setImageResource(current.img)


    }


}
