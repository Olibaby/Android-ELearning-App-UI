package com.example.elearning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        supportActionBar?.hide()
        setUpButtonOnClick()
    }

    private fun setUpButtonOnClick() {
        button5.setOnClickListener {
            var intent = Intent(this, Main3Activity ::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            var intent = Intent(this, Main4Activity :: class.java)
            startActivity(intent)
        }
    }
}
