package com.example.myapplicationa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextPaint
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    var txtOrder : TextView? = null
    var editName : EditText? = null
    var editEmail : EditText? = null
    var btnConfirm : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        txtOrder = findViewById<TextView>(R.id.txtOrder)
        var intent = intent
        txtOrder!!.text = intent.getStringExtra("order")

        editName = findViewById<EditText>(R.id.editName)
        editEmail = findViewById<EditText>(R.id.editEmail)
        btnConfirm = findViewById<Button>(R.id.btnConfirm)

        btnConfirm!!.setOnClickListener {
            val dataIntent = Intent(this,ConfirmActivity::class.java)
            dataIntent.putExtra("Order",intent.getStringExtra("order"))
            dataIntent.putExtra("Fullname",editName!!.text.toString())
            dataIntent.putExtra("Email",editEmail!!.text.toString())
            startActivity(dataIntent)
        }

    }
}