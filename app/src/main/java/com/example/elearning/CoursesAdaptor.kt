package com.example.elearning

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class CoursesAdaptor(private val lisstOfCourses: List<Courses>) : RecyclerView.Adapter<CoursesRecyclerItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoursesRecyclerItemViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.courses_view,parent,false)
        return CoursesRecyclerItemViewHolder(itemView)
    }

    override fun getItemCount(): Int {
     return lisstOfCourses.size
    }

    override fun onBindViewHolder(holder: CoursesRecyclerItemViewHolder, position: Int) {
      var item = lisstOfCourses[position]
        holder.name.text = item.courseName
        holder.days.text = item.days
        holder.percent.text = item.percent
        holder.line.setImageResource(item.line)
    }

}

class CoursesRecyclerItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
     val name = itemView.findViewById<TextView>(R.id.courseNameTextView)
     val days = itemView.findViewById<TextView>(R.id.daysTextView)
     val percent = itemView.findViewById<TextView>(R.id.percentTextview)
     val line = itemView.findViewById<ImageView>(R.id.lineImageView)
}