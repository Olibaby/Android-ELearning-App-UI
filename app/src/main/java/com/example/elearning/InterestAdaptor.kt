package com.example.elearning

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class InterestAdaptor(private val listOfInterst: List<Interests>) : RecyclerView.Adapter<InterestRecyclerItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InterestRecyclerItemViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.interest_view,parent,false)
        return InterestRecyclerItemViewHolder(itemView)
    }

    override fun getItemCount(): Int {
       return listOfInterst.size
    }

    override fun onBindViewHolder(holder: InterestRecyclerItemViewHolder, position: Int) {
        var item = listOfInterst[position]
        holder.name.text = item.name
        holder.image.setImageResource(item.image)
    }

}
class InterestRecyclerItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    val name = itemView.findViewById<TextView>(R.id.interestTextView)
    var image = itemView.findViewById<ImageView>(R.id.interestImageView)
}