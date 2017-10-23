package com.div_bytes.coderswag.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.div_bytes.coderswag.Model.Category
import com.div_bytes.coderswag.R

/**
 *@author div@hello.com (Div)
 */

class CategoryAdapter(context : Context, categories : List<Category>) : BaseAdapter() {

    val context = context
    val categories = categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item,null)

        val categoryImage = categoryView.findViewById<ImageView>(R.id.categoryImageView)
        val categoryNameText = categoryView.findViewById<TextView>(R.id.categoryTextView)

        val category = categories[position]

        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)

        categoryNameText.text = category.title
        categoryImage.setImageResource(resourceId)

        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

    private class ViewHolder {
        var categoryImage : ImageView? = null
        var categoryName : TextView? = null
    }
}