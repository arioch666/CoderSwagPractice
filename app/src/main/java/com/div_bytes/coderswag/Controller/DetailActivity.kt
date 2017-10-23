package com.div_bytes.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.div_bytes.coderswag.Model.Product
import com.div_bytes.coderswag.R
import com.div_bytes.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)

        productDetailImageView.setImageResource(resources.getIdentifier(product.image, "drawable", this.packageName))
        productDetailNameTextView.text = product.title
        productDetailPriceTextView.text = product.price
    }
}
