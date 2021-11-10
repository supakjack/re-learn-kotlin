package com.example.myapplicationa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import okhttp3.*
import java.io.IOException

class MainActivity : AppCompatActivity() {

    private val client = OkHttpClient()

//    var cardView1 : CardView? = null
//    var cardView2 : CardView? = null
//    var cardView3 : CardView? = null



    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        run("https://order-plz.herokuapp.com/restaurants.json")

//        cardView1 = findViewById<CardView>(R.id.CardView1)
//        cardView2 = findViewById<CardView>(R.id.CardView2)
//        cardView3 = findViewById<CardView>(R.id.CardView3)

//        cardView1!!.setOnClickListener {
//            val intent = Intent(this,DetailActivity::class.java)
//            intent.putExtra("order","Blue")
//            startActivity(intent)
//        }
//
//        cardView2!!.setOnClickListener {
//            val intent = Intent(this,DetailActivity::class.java)
//            intent.putExtra("order","Red")
//            startActivity(intent)
//        }
//
//        cardView3!!.setOnClickListener {
//            val intent = Intent(this,DetailActivity::class.java)
//            intent.putExtra("order","White")
//            startActivity(intent)
//        }
    }

    fun run(url: String) {
        val request = Request.Builder()
            .url(url)
            .build()

        client.newCall(request).enqueue(object : Callback {

            override fun onFailure(call: Call, e: IOException) {}
            override fun onResponse(call: Call, response: Response) = println(response.body()?.string())

            var recyclerView: RecyclerView? = null

            recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
            recyclerView!!.layoutManager = LinearLayoutManager(this)
            val itemAdapter = MyAdapter(movies ,this)
            recyclerView!!.adapter = itemAdapter

        })
    }


}