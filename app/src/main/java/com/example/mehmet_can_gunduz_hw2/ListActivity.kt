package com.example.mehmet_can_gunduz_hw2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class ListActivity : AppCompatActivity() {


        lateinit var FirstListView: ListView
        lateinit var SecondListView: ListView
        var liste1 = MainActivity.list1
        var liste2 = MainActivity.list2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        FirstListView = findViewById(R.id.firstListView)
        SecondListView = findViewById(R.id.secondListView)


        var adapter1 = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,
            liste1
        )
        var adapter2 = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,
            liste2
        )

       FirstListView.adapter = adapter1
       SecondListView.adapter = adapter2
        
        FirstListView.setOnItemClickListener { adapterView, view, i, l ->
            var item = liste1.get(i)
            Toast.makeText(this,"from Data1 $item",Toast.LENGTH_LONG).show()
        }
        SecondListView.setOnItemClickListener { adapterView, view, i, l ->
            var item = liste2.get(i)
            Toast.makeText(this,"from Data2 $item",Toast.LENGTH_LONG).show()
        }

    }
}