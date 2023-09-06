package com.app.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {

    //we will only define Recycler view components in main activity
    //and we will define the components of card in adapter class.

    lateinit var recyclerView: RecyclerView;

    var countryNameList = ArrayList<String>()
    var detailList = ArrayList<String>()
    var imageList = ArrayList<Int>()

    lateinit var adapter : CountryAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)


        //now to define how data is displays on screen(wehter horizontal, vertically or in grid we use layout manager.)
        /*
        1. LinearLayoutManager
        2. GridLayoutManager
        3. StaggeredGridLayoutManager
        4. Custom LayoutManager
        */
        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
       // recyclerView.layoutManager = GridLayoutManager(this,2)
      //  recyclerView.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)


        countryNameList.add("United States")
        countryNameList.add("Ukraine")
        countryNameList.add("India")

        detailList.add("this is US flag")
        detailList.add("this is flag of Ukraine")
        detailList.add("this is flag of india")

        imageList.add(R.drawable.usa)
        imageList.add(R.drawable.ukraine)
        imageList.add(R.drawable.india)


        adapter=CountryAdapter(countryNameList,detailList,imageList,this@MainActivity)
        recyclerView.adapter = adapter



    }
}