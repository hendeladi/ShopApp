package com.example.shopapp.Services

import com.example.shopapp.Model.Category
import com.example.shopapp.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAl", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Graphic Beanie", "18$", "hat1"),
        Product("Hat Black", "18$", "hat2"),
        Product( "Hat White", "18$", "hat3"),
        Product("Hat Snapback", "18$", "hat4")
    )

    val hoodies = listOf(
        Product("Hoodie Gray", "25$", "hoodie1"),
        Product("Hoodie Red", "25$", "hoodie2"),
        Product("Hoodie White", "25$", "hoodie3"),
        Product("Hoodie Black", "25$", "hoodie4")
    )

    val shirts = listOf(
        Product("Shirt Black", "20$", "shirt1"),
        Product("Badge Light Gray", "20$", "shirt2"),
        Product("Logo Shirt Red", "20$", "shirt3"),
        Product("Hustle", "20$", "shirt4"),
        Product("Kickflip Studios", "20$", "shirt5")
    )

    val digitalGoods = listOf<Product>()

    fun getProduct(category: String?): List<Product>{
        return when(category){
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGoods
        }
    }
}