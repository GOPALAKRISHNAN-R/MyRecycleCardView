package com.example.myrecyclecardview


import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var userMessage = findViewById<TextView>(R.id.txvUserMessage)
        userMessage.setText(intent.extras!!.getString("user"))


    }
}