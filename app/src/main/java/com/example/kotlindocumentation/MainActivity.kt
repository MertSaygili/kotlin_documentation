package com.example.kotlindocumentation

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener {
            val numberOne = etFirstNum.text.toString().toInt()
            val numberTwo = etSecondNum.text.toString().toInt()
            tvResults.text = "Result is: ${numberOne + numberTwo}"
        }


    }

}
