package com.example.elearning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main4.*

class Main4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        supportActionBar?.hide()
        setUpRecycler()
        setUpImageViewOnClick()
    }

    private fun setUpImageViewOnClick() {
        imageView4.setOnClickListener {
            var intent = Intent(this, Main5Activity ::class.java)
            startActivity(intent)
        }
    }

    val listOfInterest = listOf(Interests(R.drawable.design_icon, "Design"),
        Interests(R.drawable.development_icon, "Development"),
        Interests(R.drawable.management_icon, "Management"),
        Interests(R.drawable.marketing_icon, "Marketing"),
        Interests(R.drawable.business_icon, "Business"),
        Interests(R.drawable.blogging_icon, "Blogging")
    )

    private fun setUpRecycler() {
        val itemDecorator = GridSpacingItemDecoration(2,20,false)
        val layoutManager = GridLayoutManager(this, 2)
        interestsRecyclerView.layoutManager =  layoutManager
        interestsRecyclerView.addItemDecoration(itemDecorator)

        interestsRecyclerView.adapter = InterestAdaptor(listOfInterest)
    }
}

data class Interests(var image: Int, var name: String)
