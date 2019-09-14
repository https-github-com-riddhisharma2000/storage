package com.example.oopsproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.R.attr.button
import android.content.Intent
import android.graphics.Color

import android.graphics.drawable.ColorDrawable
import android.widget.Button


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // val myButton: Button = findViewById(R.id.btnSh)


                btnSh.setOnClickListener {
          //  Log.i("MainActivity", msg:"button was clicked by ghost")
            //Toast.makeText( this, "button was clicked by ghost", Toast.LENGTH_SHORT).show()

                    val intent = Intent(this, SecondActivity::class.java)
                    startActivity(intent)

        }

        btnShh.setOnClickListener {
            val intent = Intent(this, thirdActivity::class.java)
            startActivity(intent)
        }
    }
}
