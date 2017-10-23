package com.div_bytes.coderswag.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.div_bytes.coderswag.Model.Category
import com.div_bytes.coderswag.R

/**
 *@author div@hello.com (Div)
 */

class CategoryRecyclerAdapter(val context : Context, val categories : List<Category>) : RecyclerView.Adapter<CategoryRecyclerAdapter.Holder>() {

    override fun onBindViewHolder(holder: Holder?, position: Int) {
        holder?.bindCategory(categories[position], context)
    }

    override fun getItemCount(): Int {
        return categories.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int) : Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.category_list_item, parent, false)
        return Holder(view)
    }

    inner class Holder(itemView : View?) : RecyclerView.ViewHolder(itemView) {
        val categoryImageView = itemView?.findViewById<ImageView>(R.id.categoryImageView)
        val categoryTextView = itemView?.findViewById<TextView>(R.id.categoryTextView)

        fun bindCategory(category : Category, context : Context) {
            val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
            categoryImageView?.setImageResource(resourceId)
            categoryTextView?.text = category.title
        }

    }
}