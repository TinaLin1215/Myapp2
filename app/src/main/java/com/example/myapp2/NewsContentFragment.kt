package com.example.myapp2

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.news_content_frag.*

class NewsContentFragment:Fragment() {
    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?)
        : View? {
            return inflater.inflate(R.layout.news_content_frag,container,false)
    }
    fun refresh(title:String,context: String){
        contentLayout.visibility=View.VISIBLE
        newsTitle.text=title
        newsContent.text=context
    }
}
