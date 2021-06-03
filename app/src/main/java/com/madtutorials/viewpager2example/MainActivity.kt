package com.madtutorials.viewpager2example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.madtutorials.viewpager2example.adapter.ImageViewPagerAdapter
import com.madtutorials.viewpager2example.adapter.ViewPagerFragmentAdapter

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabTitles = arrayOf("Morning","Evening","Night")

        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        viewPager.adapter = ViewPagerFragmentAdapter(this,tabTitles)

        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        TabLayoutMediator(tabLayout,viewPager){tab, position ->
            tab.text = tabTitles[position]
        }.attach()



    }
}