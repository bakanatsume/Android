package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etfirst :EditText = findViewById(R.id.etfirst)
        val etSecond :EditText = findViewById(R.id.etsecond)
        val btnCalculate :Button = findViewById(R.id.btncalculate)

        btnCalculate.setOnClickListener {
            val first : Int = etfirst.text.toString().toInt()
            val second : Int = etSecond.text.toString().toInt()
            val result :Int = first + second
            Toast.makeText(this, "Sum is $result", Toast.LENGTH_LONG).show()
        }
    }


}