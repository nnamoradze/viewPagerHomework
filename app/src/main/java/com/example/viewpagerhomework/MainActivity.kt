package com.example.viewpagerhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpagerhomework.Fragments.FirstFragment
import com.example.viewpagerhomework.ViewPagerAdapters.ViewPagerFragmentAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var tabBar: TabLayout
    private lateinit var viewPager: ViewPager2

    private lateinit var viewPagerFragmentAdapter: ViewPagerFragmentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        

        tabBar = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewPager)

        viewPagerFragmentAdapter = ViewPagerFragmentAdapter(this)

        viewPager.adapter = viewPagerFragmentAdapter

        TabLayoutMediator(tabBar,viewPager){tab,position->

            when(position){

                0-> tab.text = "ჩემი"
                1-> tab.text = "ბავშვობის"
                2-> tab.text = "ფოტო"
            }

        }.attach()




    }
}