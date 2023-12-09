package com.example.jb1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    private lateinit var buttonTextView: Button

    private fun initComponents(){
        buttonTextView = findViewById(R.id.bottonTextview)

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_word)

        initComponents()


        buttonTextView.text = "Hallo"

        buttonTextView.setOnClickListener{
            val name = buttonTextView.text.toString()
            buttonTextView.text = "Halo $name"

            resources.getStringArray(R.array.names).forEach{ Log.i ("PZN",it )

            }
        }

    }
}