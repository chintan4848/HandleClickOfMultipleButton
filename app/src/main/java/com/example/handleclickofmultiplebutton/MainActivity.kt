package com.example.handleclickofmultiplebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun onclick(view: View) {
        Toast.makeText(this,"button click",Toast.LENGTH_LONG).show()
    }
}