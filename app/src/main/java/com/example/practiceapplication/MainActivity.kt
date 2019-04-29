package com.example.practiceapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = arrayListOf(CustomListItem("one", "#4286f4"),
            CustomListItem("two", "#12d152"), CustomListItem("three", "#b20315"))

        val pagerAdapter = MyPagerAdapter(supportFragmentManager)
        pagerAdapter.setList(list)
        viewpager.adapter = pagerAdapter
        viewpager.setCurrentItem(1, false)
        viewpager.addOnPageChangeListener(object: ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(p0: Int) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onPageScrolled(p0: Int, p1: Float, p2: Int) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onPageSelected(position: Int) {
                if (position == 0) {
                    Handler().postDelayed({
                        viewpager.setCurrentItem(list.size, false)
                    }, 200)
                } else if (position == list.size + 1) {
                    Handler().postDelayed({
                        viewpager.setCurrentItem(1, false)
                    }, 200)
                }
            }

        })
    }

    inner class MyPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {
        private lateinit var list: ArrayList<CustomListItem>

        fun setList(list: ArrayList<CustomListItem>) {
            this.list = ArrayList()
            this.list.add(list[list.size - 1])
            this.list.addAll(list)
            this.list.add(list[0])
        }

        override fun getItem(position: Int): Fragment {
            val adapterItemFragment = MyPagerAdapterItem()
            adapterItemFragment.adapterData = list[position]

            return adapterItemFragment

        }

        override fun getCount(): Int {
            return list.size
        }

    }

    data class CustomListItem(val name: String, val bgColor: String)
}
