package com.example.oopsproject

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.app.ActionBar
//import android.content.Context
import android.os.Build



import android.view.MotionEvent
import android.view.View.OnTouchListener
import android.view.Gravity
import android.widget.PopupWindow
import android.widget.LinearLayout

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.transition.Slide
import android.transition.TransitionManager
import android.view.LayoutInflater

import android.widget.*

//import android.view.LayoutInflater
import android.view.View;
import android.widget.Button;

import android.view.ViewGroup.LayoutParams;
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_forgotp.view.*
import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : AppCompatActivity() {


      @SuppressLint("InflateParams")
      override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

          val forgotButton = findViewById<Button>(R.id.forgetPasswordButton)

          forgotButton.setOnClickListener {
             //inflate the dialog box with customn
              val popup = LayoutInflater.from(this).inflate(R.layout.activity_forgotp,null)

              //AlertDialog builder
              val mbuilder = AlertDialog.Builder(this)
                  .setView(popup)
                  .setTitle("forgot Page")

              //show Dialog
              val malertDialog = mbuilder.show()

              popup.closeBtn.setOnClickListener {
                  //dismiss dialog
                  malertDialog.dismiss()
              }
          }

          val signUpBtn = findViewById<Button>(R.id.sign_up)

          signUpBtn.setOnClickListener {

              val intent = Intent(this,thirdActivity ::class.java)
              startActivity(intent)
          }
    }


}
//object : Button.OnClickListener()
