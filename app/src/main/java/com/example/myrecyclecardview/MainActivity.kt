package com.example.myrecyclecardview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnShowToast.setOnClickListener {
            //developer purpose, visible in Logcat
            Log.i("Info", "Button was clicked !")
            //user purpose
            Toast.makeText(this,"Button was clicked !",Toast.LENGTH_SHORT).show()
        }


        /*
        * Explicit Intent
        * */
        btnSendMsgToNextActivity.setOnClickListener {
            val message: String = etUserMessage.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("user", message)
            startActivity(intent)
        }


        /*
        * Implicit Intent
        * */
        btnShareToOtherApps.setOnClickListener {
            val message: String = etUserMessage.text.toString()
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "Please select app: "))
        }

        /*
        * Explicit intent
        * */
        btnRecyclerViewDemo.setOnClickListener {
            val intent = Intent(this, HobbiesActivity::class.java)
            startActivity(intent)
        }

    }


}
