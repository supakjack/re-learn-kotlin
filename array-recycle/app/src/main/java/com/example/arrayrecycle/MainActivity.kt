package com.example.arrayrecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
     val movies = arrayOf(
        "aaaaaaaaaaaaaaaa 1",
        "bbbbbbbbbbbbbbbbbbbbb 2",
        "cccccccccccccccccccccccc 3",
        "ddddddddddddddddddddddddddd 4",
        "eeeeeeeeeeeeeeeeeeeeeeeeeeeeee 5"
    )
     var recyclerView: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView!!.layoutManager = LinearLayoutManager(this)
        val itemAdapter = MyAdapter(movies ,this)
        recyclerView!!.adapter = itemAdapter
    }
}