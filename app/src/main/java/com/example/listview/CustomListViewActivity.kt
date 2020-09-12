package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_custom_list_view.*

class CustomListViewActivity : AppCompatActivity() {

    var mList:ArrayList<News> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_list_view)

        init()
    }

    private fun init() {
        generateData()
        var adapterNews = AdapterNews(this, mList)
        list_view.adapter = adapterNews
    }

    private fun generateData(){
        mList.add(News("Inception" , "A guy goes inside peoples dreams", R.drawable.inception))
        mList.add(News("Predestination" , "Story of a time traveller", R.drawable.predestination))
        mList.add(News("Shutter Island" , "US marshal goes to insane asylum for investigation", R.drawable.shutterisland))
        mList.add(News("Memento" , "Guy suffers from memory loss", R.drawable.memento))

    }
}