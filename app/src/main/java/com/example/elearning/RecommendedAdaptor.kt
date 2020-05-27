package com.example.elearning

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecommendedAdaptor(private val listOfRecommended: List<Recommended>) : RecyclerView.Adapter<RecommendedRecyclerItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecommendedRecyclerItemViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recommended_view,parent,false)
        return RecommendedRecyclerItemViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return listOfRecommended.size
    }

    override fun onBindViewHolder(holder: RecommendedRecyclerItemViewHolder, position: Int) {
     val item = listOfRecommended[position]
        holder.image.setImageResource(item.image)
        holder.name.text = item.name
        holder.price.text = item.price
    }

}

class RecommendedRecyclerItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
   val image = itemView.findViewById<ImageView>(R.id.recommendedImageView)
    val name = itemView.findViewById<TextView>(R.id.recommendedTextView)
    val price = itemView.findViewById<TextView>(R.id.priceTextView)
}
