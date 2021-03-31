package com.example.doggydates

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SignupScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_screen)

        val actionBar = supportActionBar
        /*if(actionBar != null){
            actionBar.title = "Login"
        }*/
        actionBar!!.title = "Sign Up"

        actionBar.setDisplayHomeAsUpEnabled(true) //Set up arrow to go back within the app



    }
}