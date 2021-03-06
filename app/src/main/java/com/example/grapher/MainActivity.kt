package com.example.grapher

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import model.Node

/** AppCompatActivity replaces Activity in this library */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.start_grapher)

        button.setOnClickListener{
            startActivity(Intent(this, GraphActivity::class.java))
        }
        Node.resetCounter()
    }
}