package com.example.elearning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        supportActionBar?.hide()
        setUpButtonOnClick()
    }

    private fun setUpButtonOnClick() {
        button6.setOnClickListener {
            var intent = Intent(this, Main2Activity :: class.java)
            startActivity(intent)
        }
    }
}
