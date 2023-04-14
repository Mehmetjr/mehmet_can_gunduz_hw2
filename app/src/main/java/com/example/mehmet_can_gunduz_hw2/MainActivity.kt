package com.example.mehmet_can_gunduz_hw2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var edt_item_list1: EditText
    lateinit var edt_item_list2: EditText
    lateinit var btn_add_list1 : Button
    lateinit var btn_add_list2: Button
    lateinit var btn_show_list : Button


    companion object{
    var list1 = mutableListOf<String>()
    var list2 = mutableListOf<String>()
}


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edt_item_list1 = findViewById(R.id.edt_item_list1)
        edt_item_list2 = findViewById(R.id.edt_item_list2)
        btn_add_list1 = findViewById(R.id.btn_add_list1)
        btn_add_list2 = findViewById(R.id.btn_add_list2)
        btn_show_list = findViewById(R.id.btn_show_list)


        btn_add_list1.setOnClickListener {

            list1.add(edt_item_list1.text.toString())
            Toast.makeText(this,"List1'e kaydedildi",Toast.LENGTH_LONG).show()
            edt_item_list1.setText("")
            edt_item_list1.requestFocus()

        }
        btn_add_list2.setOnClickListener {
            list2.add(edt_item_list2.text.toString())
            Toast.makeText(this,"List2'ye kaydedildi",Toast.LENGTH_LONG).show()
            edt_item_list2.setText("")
            edt_item_list2.requestFocus()
        }


        btn_show_list.setOnClickListener {
            var intent = Intent(this,ListActivity::class.java)
            startActivity(intent)
        }

    }
}