package com.example.myapplicationa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ConfirmActivity : AppCompatActivity() {
    var showOrder : TextView? = null;
    var showName : TextView? = null;
    var showEmail : TextView? = null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm)
        showOrder = findViewById<TextView>(R.id.showOrder)
        showName = findViewById<TextView>(R.id.showName)
        showEmail = findViewById<TextView>(R.id.showEmail)
        var intent = intent
        showOrder!!.text = intent.getStringExtra("Order")
        showName!!.text = intent.getStringExtra("Fullname")
        showEmail!!.text = intent.getStringExtra("Email")

    }
}