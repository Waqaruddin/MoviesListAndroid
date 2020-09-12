package com.example.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.row_list_view_adapter.view.*

class AdapterNews(private var mContext: Context, private var mList:ArrayList<News>): BaseAdapter(){
    override fun getCount(): Int {
        return mList.size
    }

    override fun getItem(position: Int): Any {
        return mList.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, view: View?, parent: ViewGroup?): View {
      var view =   LayoutInflater.from(mContext).inflate(R.layout.row_list_view_adapter,parent,false)

        var news = mList.get(position)
        view.text_view_title.text = news.title
        view.text_view_description.text = news.description
        view.image_view.setImageResource(news.img)
        return view
    }

}