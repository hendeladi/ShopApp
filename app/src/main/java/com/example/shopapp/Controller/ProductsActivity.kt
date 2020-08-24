package com.example.shopapp.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.shopapp.Adapters.ProductsAdapter
import com.example.shopapp.R
import com.example.shopapp.Services.DataService
import com.example.shopapp.utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {
    lateinit var adapter: ProductsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)
        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductsAdapter(this, DataService.getProduct(categoryType))

        val layoutManager = GridLayoutManager(this, 2)
        productListView.layoutManager = layoutManager
        productListView.adapter = adapter
    }
}