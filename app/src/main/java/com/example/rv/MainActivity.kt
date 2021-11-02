package com.example.rv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView

    private lateinit var newArrayList: ArrayList<Movie>

    lateinit var imageId: Array<Int>
    lateinit var heading: Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.harry_potter_1,
            R.drawable.harry_potter_2,
            R.drawable.harry_potter_3

        )

        heading = arrayOf(
            "Harry Potter and the Philosopher's Stone",
            "Harry Potter and The Chamber Of Secrets",
            "Harry Potter and Prisoner Of Azkaban"
        )

        newRecyclerView = findViewById(R.id.rv)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<Movie>()
        getMovieData()

    }

    private fun getMovieData() {


        for(i in imageId.indices) {

            val movies = Movie(imageId[i],heading[i])
            newArrayList.add(movies)

        }

        newRecyclerView.adapter = MyAdapter(newArrayList)
    }
}