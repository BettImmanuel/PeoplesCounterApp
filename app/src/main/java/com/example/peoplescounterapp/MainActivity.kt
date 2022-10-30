package com.example.peoplescounterapp

import android.annotation.SuppressLint
import android.icu.text.CaseMap.Title
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.widget.AppCompatTextView
import com.example.peoplescounterapp.R.id.txViewMe

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")

    private var txViewMe : TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        getSupportActionBar()?.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM)
        getSupportActionBar()?.setCustomView(R.layout.action_bar_layout)

        val btnClickMe = findViewById<Button>(R.id.btnClickMe)
        val txViewMe = findViewById<TextView>(R.id.txViewMe)

        var timesClicked = 0

        btnClickMe.setOnClickListener {
            timesClicked ++
            txViewMe.text = timesClicked.toString()
        }
        val btnClear = findViewById<Button>(R.id.btnClear)

        btnClear.setOnClickListener {
            timesClicked = 0
            txViewMe.setText(null)

        }

    }
}