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
        Category("HOODIES", "hoodyimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18", "hat01"),
            Product("Devslopes Hat Black", "$20", "hat02"),
            Product("Devslopes Hat White", "$19", "hat03"),
            Product("Devslopes Hat Snapback", "$23", "hat04")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$28", "hoodie01"),
            Product("Devslopes Hoodie Red", "$30", "hoodie02"),
            Product("Devslopes Gray Hoodie", "$28", "hoodie03"),
            Product("Devslopes Black Hoodie", "$29", "hoodie04")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Black", "$40", "shirt01"),
            Product("Devslopes Badge Light Gray", "$30", "shirt02"),
            Product("Devslopes Logo Shirt Red", "$22", "shirt03"),
            Product("Devslopes Hustle", "$25", "shirt04"),
            Product("Kickflip Studios", "$27", "shirt05")
    )
}