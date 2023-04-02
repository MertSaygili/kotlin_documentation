//package com.example.kotlindocumentation
//
//import android.os.Bundle
//import androidx.appcompat.app.AppCompatActivity
//import kotlinx.android.synthetic.main.send_datasecond_activity.*
//
//class SecondActivity : AppCompatActivity(){
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.send_data_second_activity)
//
//        val name = intent.getStringExtra("EXTRA_NAME")
//        val age = intent.getIntExtra("EXTRA_AGE", 0)
//        val country = intent.getStringExtra("EXTRA_COUNTRY")
//
//        val info = "name: $name\nage: $age\ncountry: $country"
//        tvPersonInformation.text = info
//    }
//}