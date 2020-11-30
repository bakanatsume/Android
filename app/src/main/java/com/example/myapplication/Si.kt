package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Si : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_si)

        val etPrincipal : EditText = findViewById(R.id.etPrinciple)
        val etRate : EditText = findViewById(R.id.etRate)
        val etTime : EditText = findViewById(R.id.etTime)

        val btnCalc : Button = findViewById(R.id.btnCalc)

        btnCalc.setOnClickListener {
            val a : Float  = etPrincipal.text.toString().toFloat()
            val b : Float = etRate.text.toString().toFloat()
            val c : Float = etTime.text.toString().toFloat()
            val d : Float = (a*b*c)/100

            Toast.makeText(this, "Simple Interest of given principle ,rate and time is $d", Toast.LENGTH_LONG).show()
        }
    }
}
