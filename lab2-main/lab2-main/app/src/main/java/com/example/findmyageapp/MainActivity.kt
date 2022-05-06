package com.example.findmyageapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buGetAge: Button = findViewById(R.id.buGetAge)
        buGetAge.setOnClickListener{getAge()}
    }
    fun getAge() {
        val textView : TextView = findViewById(R.id.textView)
        val year: EditText = findViewById(R.id.editText)
        val userYear: Int = Integer.parseInt(year.text.toString())
        if (userYear==0){
            textView.text=" invalid input"
            return
        }
        val currentYear: Int = Calendar.getInstance().get(Calendar.YEAR)
        val userAge: Int = currentYear - userYear

        textView.text = "You age is $userAge"
    }


}