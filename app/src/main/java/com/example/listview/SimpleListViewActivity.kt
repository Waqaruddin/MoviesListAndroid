package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_simple_list_view.*

class SimpleListViewActivity : AppCompatActivity() {

    var mList:ArrayList<String> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_list_view)

        init()
    }

    private fun init() {
        generateData()

        ///Setup Adapter
        var myAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, mList)

        /// Setup list view with adapter
        list_view.adapter = myAdapter

        /// ListView Item Click
        list_view.setOnItemClickListener(object: AdapterView.OnItemClickListener{

            override fun onItemClick(
                p0: AdapterView<*>?,
                item: View?,
                position: Int,
                itemId: Long
            ) {
                Toast.makeText(applicationContext, myAdapter.getItem(position), Toast.LENGTH_SHORT).show()
            }

        })
    }

    private fun generateData(){
        mList.add("USA")
        mList.add("UK")
        mList.add("India")
        mList.add("Japan")
        mList.add("USA")
        mList.add("UK")
        mList.add("India")
        mList.add("Japan")
        mList.add("USA")
        mList.add("UK")
        mList.add("India")
        mList.add("Japan")
        mList.add("USA")
        mList.add("UK")
        mList.add("India")
        mList.add("Japan")
        mList.add("USA")
        mList.add("UK")
        mList.add("India")
        mList.add("Japan")
        mList.add("USA")
        mList.add("UK")
        mList.add("India")
        mList.add("Japan")


    }
}