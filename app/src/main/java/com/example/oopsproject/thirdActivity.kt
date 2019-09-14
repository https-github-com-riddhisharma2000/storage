package com.example.oopsproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class thirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val logInbtn = findViewById<Button>(R.id.logInbtn)

        val signUpbtn = findViewById<Button>(R.id.signUpbtn)

        logInbtn.setOnClickListener {

            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)

        }

        signUpbtn.setOnClickListener {
            val intent = Intent(this,homePageActivity::class.java)
        }
    }
}
