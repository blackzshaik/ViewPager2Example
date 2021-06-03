package com.madtutorials.viewpager2example.adapter

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.madtutorials.viewpager2example.fragments.EveningFragment
import com.madtutorials.viewpager2example.fragments.MorningFragment
import com.madtutorials.viewpager2example.fragments.NightFragment

class ViewPagerFragmentAdapter(appCompatActivity: AppCompatActivity, private val tabTitles:Array<String>) :
    FragmentStateAdapter(appCompatActivity) {


    override fun getItemCount(): Int =  tabTitles.size

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 ->{
                MorningFragment().let {
                    val bundle = Bundle()
                    bundle.putString("PAGE_TITLE",tabTitles[position])
                    it.arguments = bundle
                    return it
                }
            }
            1 -> {
                EveningFragment().apply {
                    val bundle = Bundle()
                    bundle.putString("PAGE_TITLE",tabTitles[position])
                    arguments = bundle
                }
            }
            else -> {
                NightFragment().apply {
                    val bundle = Bundle()
                    bundle.putString("PAGE_TITLE",tabTitles[position])
                    arguments = bundle
                }
            }
        }
    }

}