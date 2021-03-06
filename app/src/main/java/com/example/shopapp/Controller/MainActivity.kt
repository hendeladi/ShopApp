package com.example.shopapp.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
 
import android.widget.Toast

import androidx.recyclerview.widget.LinearLayoutManager

import com.example.shopapp.Adapters.CategoryAdapter
import com.example.shopapp.Adapters.CategoryRecyclerAdapter
import com.example.shopapp.Model.Category
import com.example.shopapp.R
import com.example.shopapp.Services.DataService
import com.example.shopapp.utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter: CategoryRecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecyclerAdapter(this, DataService.categories){category ->
            val productIntent = Intent(this,ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY,category.title)
            startActivity(productIntent)
        }
        categoryListView.adapter = adapter



	val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager =layoutManager
        categoryListView.setHasFixedSize(true)
    }
}
