package com.div_bytes.coderswag.Controller

import android.content.Intent
import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.OrientationHelper
import com.div_bytes.coderswag.Adapter.ProductsAdapter
import com.div_bytes.coderswag.R
import com.div_bytes.coderswag.Utilities.EXTRA_CATEGORY
import com.div_bytes.coderswag.Utilities.EXTRA_PRODUCT
import com.div_bytes.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter : ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        adapter = ProductsAdapter(this, DataService.getProducts(intent.getStringExtra(EXTRA_CATEGORY))) { product ->
            val detailIntent = Intent(this, DetailActivity::class.java)
            detailIntent.putExtra(EXTRA_PRODUCT, product)
            startActivity(detailIntent)
        }

        var spanCount = 2;
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spanCount = 3;
        }

        val screenSize = resources.configuration.screenWidthDp
        if (screenSize >= 750) {
            spanCount = 3
        }

        val layoutManager = GridLayoutManager(this, spanCount)

        productsListView.adapter = adapter
        productsListView.layoutManager = layoutManager
    }


}
