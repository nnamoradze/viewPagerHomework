package com.example.viewpagerhomework.ViewPagerAdapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpagerhomework.Fragments.FirstFragment
import com.example.viewpagerhomework.Fragments.SecondFragment
import com.example.viewpagerhomework.Fragments.ThirdFragment

class ViewPagerFragmentAdapter(activity: FragmentActivity): FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0-> FirstFragment()
            1-> SecondFragment()
            2-> ThirdFragment()
            else -> FirstFragment()
        }
    }


}