package com.example.shopapp.Controller

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.shopapp.Adapters.ProductsAdapter
import com.example.shopapp.Model.Product
import com.example.shopapp.R
import com.example.shopapp.Services.DataService
import com.example.shopapp.utilities.EXTRA_CATEGORY
import com.example.shopapp.utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {
    lateinit var adapter: ProductsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)
        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductsAdapter(this, DataService.getProduct(categoryType)){product ->
            val detailedProductIntent = Intent(this,DetailedProductActivity::class.java)
            val bundle = Bundle()
            bundle.putParcelable(EXTRA_PRODUCT, product)
            detailedProductIntent.putExtra("Bundle", bundle)
            startActivity(detailedProductIntent)
        }

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 3
        }
        val layoutManager = GridLayoutManager(this, spanCount)
        productListView.layoutManager = layoutManager
        productListView.adapter = adapter
    }
}