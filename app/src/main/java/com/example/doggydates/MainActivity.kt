package com.example.doggydates

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBar = supportActionBar

        actionBar!!.title = "Doggy Dates"

        textView2.setOnClickListener{
            val intent = Intent(this, SignupScreen::class.java)
            startActivity(intent)
        }
        /*textView3.setOnClickListener{
            val intent = Intent(this, )
        }*/


    }


}