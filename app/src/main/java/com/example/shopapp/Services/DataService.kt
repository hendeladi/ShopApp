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
        Product("Graphic Beanie", "18$", "hat01"),
        Product("Hat Black", "18$", "hat02"),
        Product( "Hat White", "18$", "hat03"),
        Product("Hat Snapback", "18$", "hat04")
    )

    val hoodies = listOf(
        Product("Hoodie Gray", "25$", "hoodie01"),
        Product("Hoodie Red", "25$", "hoodie02"),
        Product("Hoodie White", "25$", "hoodie03"),
        Product("Hoodie Black", "25$", "hoodie04")
    )

    val shirts = listOf(
        Product("Shirt Black", "20$", "shirt01"),
        Product("Badge Light Gray", "20$", "shirt02"),
        Product("Logo Shirt Red", "20$", "shirt03"),
        Product("Hustle", "20$", "shirt04"),
        Product("Kickflip Studios", "20$", "shirt05")
    )
}