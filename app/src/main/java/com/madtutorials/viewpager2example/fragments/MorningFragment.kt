package com.madtutorials.viewpager2example.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.madtutorials.viewpager2example.R

class MorningFragment :Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.viewpager_item, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.findViewById<ImageView>(R.id.imageView).setImageDrawable(ContextCompat.getDrawable(view.context,R.drawable.image_0900))
        view.findViewById<TextView>(R.id.pageTitle).text = arguments?.getString("PAGE_TITLE") ?: "PAGE"
        view.findViewById<TextView>(R.id.pageDescription).text = getString(R.string.morning_wiki)
    }
}