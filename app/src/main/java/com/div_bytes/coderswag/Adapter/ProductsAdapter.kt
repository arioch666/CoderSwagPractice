package com.div_bytes.coderswag.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.div_bytes.coderswag.Model.Product
import com.div_bytes.coderswag.R

/**
 *@author div@hello.com (Div)
 */

class ProductsAdapter(var context: Context, var products : List<Product>, val itemClick : (Product) -> Unit) : RecyclerView.Adapter<ProductsAdapter.ProductHolder>() {

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ProductHolder {
        return ProductHolder(LayoutInflater.from(context).inflate(R.layout.product_list_item, parent, false))
    }

    override fun onBindViewHolder(holder: ProductHolder?, position: Int) {
        holder?.bindProduct(products[position], context, itemClick)
    }

    inner class ProductHolder (itemView : View?) : RecyclerView.ViewHolder(itemView) {
        val productImage = itemView?.findViewById<ImageView>(R.id.productImageView)
        val productName = itemView?.findViewById<TextView>(R.id.productNameTextView)
        val productPrice = itemView?.findViewById<TextView>(R.id.productPriceTextView)

        fun bindProduct(product : Product, context : Context, itemClick : (Product) -> Unit) {
            productImage?.setImageResource(context.resources.getIdentifier(product.image, "drawable", context.packageName))
            productName?.text = product.title
            productPrice?.text = product.price
            itemView.setOnClickListener{
                itemClick(product)
            }
        }
    }
}