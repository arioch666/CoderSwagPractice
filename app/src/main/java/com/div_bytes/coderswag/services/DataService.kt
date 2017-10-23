package com.div_bytes.coderswag.services

import com.div_bytes.coderswag.Model.Category
import com.div_bytes.coderswag.Model.Product
import com.div_bytes.coderswag.R

/**
 *@author div@hello.com (Div)
 * Singleton
 */

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18", "hat1"),
            Product("Devslopes Hat Black", "$20", "hat2"),
            Product("Devslopes Hat White", "$19", "hat3"),
            Product("Devslopes Hat Snapback", "$23", "hat4"),
            Product("Devslopes Graphic Beanie", "$18", "hat1"),
            Product("Devslopes Hat Black", "$20", "hat2"),
            Product("Devslopes Hat White", "$19", "hat3"),
            Product("Devslopes Hat Snapback", "$23", "hat4"),
            Product("Devslopes Graphic Beanie", "$18", "hat1"),
            Product("Devslopes Hat Black", "$20", "hat2"),
            Product("Devslopes Hat White", "$19", "hat3"),
            Product("Devslopes Hat Snapback", "$23", "hat4")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$28", "hoodie1"),
            Product("Devslopes Hoodie Red", "$30", "hoodie2"),
            Product("Devslopes Gray Hoodie", "$28", "hoodie3"),
            Product("Devslopes Black Hoodie", "$29", "hoodie4"),
            Product("Devslopes Hoodie Gray", "$28", "hoodie1"),
            Product("Devslopes Hoodie Red", "$30", "hoodie2"),
            Product("Devslopes Gray Hoodie", "$28", "hoodie3"),
            Product("Devslopes Black Hoodie", "$29", "hoodie4"),
            Product("Devslopes Hoodie Gray", "$28", "hoodie1"),
            Product("Devslopes Hoodie Red", "$30", "hoodie2"),
            Product("Devslopes Gray Hoodie", "$28", "hoodie3"),
            Product("Devslopes Black Hoodie", "$29", "hoodie4")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Black", "$40", "shirt1"),
            Product("Devslopes Badge Light Gray", "$30", "shirt2"),
            Product("Devslopes Logo Shirt Red", "$22", "shirt3"),
            Product("Devslopes Hustle", "$25", "shirt4"),
            Product("Kickflip Studios", "$27", "shirt5"),
            Product("Devslopes Shirt Black", "$40", "shirt1"),
            Product("Devslopes Badge Light Gray", "$30", "shirt2"),
            Product("Devslopes Logo Shirt Red", "$22", "shirt3"),
            Product("Devslopes Hustle", "$25", "shirt4"),
            Product("Kickflip Studios", "$27", "shirt5"),
            Product("Devslopes Shirt Black", "$40", "shirt1"),
            Product("Devslopes Badge Light Gray", "$30", "shirt2"),
            Product("Devslopes Logo Shirt Red", "$22", "shirt3"),
            Product("Devslopes Hustle", "$25", "shirt4"),
            Product("Kickflip Studios", "$27", "shirt5")
    )

    val digitalGoods = listOf<Product>()

    fun getProducts(category : String) : List<Product> {
        return when (category) { //switch statement from java
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGoods //default in switch case for java
        }
    }
}