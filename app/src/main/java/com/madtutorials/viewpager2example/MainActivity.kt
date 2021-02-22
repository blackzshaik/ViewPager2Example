package com.madtutorials.viewpager2example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.madtutorials.viewpager2example.adapter.ImageViewPagerAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<ViewPager2>(R.id.viewPager).adapter = ImageViewPagerAdapter()

    }
}