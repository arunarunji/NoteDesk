@file:Suppress("DEPRECATION")

package com.example.version2.presentation.profile

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdaptor(
    fragmentActivity: FragmentManager,
    private val tabTitles: MutableList<String>,
    val fragment: MutableList<Fragment>
) : FragmentPagerAdapter(fragmentActivity) {


    override fun getCount(): Int {

        return fragment.size
    }

    override fun getItem(position: Int): Fragment {


        return fragment[position]

    }


    override fun getPageTitle(position: Int): CharSequence {
        return tabTitles[position]
    }

}