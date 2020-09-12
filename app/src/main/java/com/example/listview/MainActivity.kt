package com.example.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat.startActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        button_simple.setOnClickListener(this)
        button_custom.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when(view.id){
            R.id.button_simple -> startActivity(Intent(this, SimpleListViewActivity::class.java))
            R.id.button_custom -> startActivity(Intent(this, CustomListViewActivity::class.java))
        }
    }
}