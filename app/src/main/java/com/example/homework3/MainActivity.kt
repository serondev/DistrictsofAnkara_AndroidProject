package com.example.homework3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.RecyclerView
import com.example.homework3.R.id.listView
import com.google.android.play.core.internal.i
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_list.*

class MainActivity : AppCompatActivity() {
    val hoods = arrayOf("Batıkent","Yenimahalle","Altındağ","Bahçelievler","Eryaman","Sincan","Etlik")  //array of strings
    private lateinit var navController:NavController //nav controller
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navhostFragment= supportFragmentManager.findFragmentById(R.id.fragment) as NavHostFragment
        navController = navhostFragment.navController // getting navcontroller from navhostfragment

        val listView = findViewById<ListView>(R.id.listView) // getting listview from layout
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,hoods) // creating adapter
        listView.adapter = adapter // setting adapter to listview
        listView.onItemClickListener = object : AdapterView.OnItemClickListener{
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: android.view.View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(applicationContext,"Clicked Item = "+hoods[position],Toast.LENGTH_SHORT).show()
            } // setting on item click listener to listview

        }


    }



        

    }
