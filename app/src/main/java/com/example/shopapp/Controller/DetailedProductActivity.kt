package com.example.shopapp.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.shopapp.Model.Product
import com.example.shopapp.R
import com.example.shopapp.utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_detailed_product.*


class DetailedProductActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_product)

        val bundle = intent.getBundleExtra("Bundle")
        if( bundle != null){
            val product = bundle.getParcelable<Product>(EXTRA_PRODUCT)
            val resourceId = this.resources.getIdentifier(product?.image,"drawable", this.packageName )
            productImage.setImageResource(resourceId)
            productName.text = product?.title
            println(product?.title)
            productPrice.text = product?.price
            productDescription.text = product?.description
        }

    }
}