package com.example.hp.smartattsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt=findViewById(R.id.txt_display) as TextView
        txt.text="Hello SmartAtt"
    }
}
