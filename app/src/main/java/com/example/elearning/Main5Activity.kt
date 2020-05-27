package com.example.elearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main5.*

class Main5Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        supportActionBar?.hide()
        setUpRecycler()
    }

    private fun setUpRecycler() {
       couresRecyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        couresRecyclerView.adapter = CoursesAdaptor(listOfCourses)

        recommendedRecyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        recommendedRecyclerView.adapter = RecommendedAdaptor(listOfRecommended)

        freeCoursesRecyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        freeCoursesRecyclerView.adapter = FreeCoursesAdaptor(listOfFreeCourses)

    }

    val listOfCourses = listOf(Courses("Introduction to Typography", "5 days left", "50% complete", R.drawable.typography_line),
        Courses("TypeScipt Essentials", "10 days left", "80% complete", R.drawable.typescript_line),
        Courses("Color Theory", "12 days left", "80% complete", R.drawable.typescript_line)
    )

    val listOfRecommended = listOf(Recommended(R.drawable.angular_image, "Angular 5", "$26"),
        Recommended(R.drawable.typescript_image, "Typescript","$22"),
        Recommended(R.drawable.node_image, "Node js", "$18")
    )

    val listOfFreeCourses = listOf(FreeCourses(R.drawable.adobe_image, "Adobe Xd"),
        FreeCourses(R.drawable.intro_to_ui_image,"Wireframing"),
        FreeCourses(R.drawable.adobe_illustrator_image, "Adobe Illustrator")
    )
}

data class Courses(var courseName: String, var days: String, var percent: String, var line: Int)
data class Recommended(var image: Int, var name: String, var price: String)
data class FreeCourses(var image: Int, var name:String)
