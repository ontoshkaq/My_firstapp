package com.example.myfirstapp

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun toastMe(view: View){
        val myToast = Toast.makeText(this, "Hello toast", Toast.LENGTH_SHORT)
            myToast.show()
    }
    fun countMe(view: View){
        val countString = textView.text.toString()
        var count: Int = Integer.parseInt(countString)
        textView.text = count.toString()
    }
}