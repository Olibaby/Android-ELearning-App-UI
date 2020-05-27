package com.example.elearning

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FreeCoursesAdaptor(private val listOfFreeCourses: List<FreeCourses>) : RecyclerView.Adapter<FreeCoursesRecyclerItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FreeCoursesRecyclerItemViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.freecourses_view,parent,false)
        return FreeCoursesRecyclerItemViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return  listOfFreeCourses.size
    }

    override fun onBindViewHolder(holder: FreeCoursesRecyclerItemViewHolder, position: Int) {
        var item = listOfFreeCourses[position]
        holder.image.setImageResource(item.image)
        holder.name.text = item.name
    }

}

class FreeCoursesRecyclerItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    val image = itemView.findViewById<ImageView>(R.id.freeCoursesImageView)
    val name = itemView.findViewById<TextView>(R.id.freeCoursesTextView)
}
