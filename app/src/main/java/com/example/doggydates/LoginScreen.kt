package com.example.doggydates

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LoginScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        val actionBar = supportActionBar

        /*if(actionBar != null){
            actionBar.title = "Login"
        }*/
        actionBar!!.title = "Login"

        actionBar.setDisplayHomeAsUpEnabled(true) //Set up arrow to go back within the app
    }
}