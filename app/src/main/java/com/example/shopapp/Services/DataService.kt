package com.example.shopapp.Services

import com.example.shopapp.Model.Category

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatomage"),
        Category("DIGITAl", "digitalgoodsimage")
    )
}