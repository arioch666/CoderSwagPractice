package com.div_bytes.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.div_bytes.coderswag.Adapter.CategoryRecyclerAdapter
import com.div_bytes.coderswag.R
import com.div_bytes.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecyclerAdapter(this, DataService.categories)
        categoryListView.adapter = adapter

        categoryListView.layoutManager = LinearLayoutManager(this )
        categoryListView.setHasFixedSize(true)


    }
}
