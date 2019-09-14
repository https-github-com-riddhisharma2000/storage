package com.example.internalstorage



import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.io.OutputStreamWriter
//hello
class MainActivity: AppCompatActivity() {
    // coding180.c0m
    override fun onCreate (savedInstanceState: Bundle?) {
        super.onCreate (savedInstanceState)
        setContentView (R.layout.activity_main)

        val et1 = findViewById (R.id.et1) as EditText
        val et2 = findViewById (R.id.et2) as EditText
        val button1 = findViewById (R.id.button1) as Button
        button1.setOnClickListener {
            val filename = et1.text.toString (). replace ('/', '-')
            try {
                val file = OutputStreamWriter (openFileOutput (filename, Activity.MODE_PRIVATE))
                file.write (et2.text.toString ())
                file.flush ()
                file.close ()
            } catch (e: IOException) {
            }
            Toast.makeText (this, filename, Toast.LENGTH_SHORT) .show ()
            et1.setText ("")
            et2.setText ("")
        }

        val button2 = findViewById (R.id.button2) as Button
        button2.setOnClickListener {
            var filename = et1.text.toString (). replace ('/', '-')
            if (fileList (). contains (filename)) {
                try {
                    val file = InputStreamReader (openFileInput (filename))
                    val br = BufferedReader (file)
                    var line = br.readLine ()
                    val all = StringBuilder ()
                    while (line!= null) {
                        all.append (line + "\n")
                        line = br.readLine ()
                    }
                    br.close ()
                    file.close ()
                    et2.setText (all)
                } catch (e: IOException) {
                }
            } else {
                Toast.makeText (this, "No data recorded for that date", Toast.LENGTH_LONG) .show ()
                et2.setText ("")
            }
        }
    }
}