package edu.temple.simplerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("Print this out", "Print this out")

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Step 1: Reference RecyclerView object
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        //Step 2: Provide a LayoutManager
        val numberArray = Array(100){i -> (i + 1)}
        Log.d("Number", numberArray.toString())
        recyclerView.layoutManager = LinearLayoutManager(this)


        //Step 4: Provide a RecyclerView.Adapter

        recyclerView.adapter = NumberDisplayAdapter(numberArray)
    }
}