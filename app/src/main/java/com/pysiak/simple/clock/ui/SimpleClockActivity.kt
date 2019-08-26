package com.pysiak.simple.clock.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import com.pysiak.simple.clock.R
import com.pysiak.simple.clock.presenter.ClockPresenter
import com.pysiak.simple.clock.presenter.TabAdapter
import com.pysiak.simple.clock.presenter.SimpleClockView


class SimpleClockActivity : AppCompatActivity(), SimpleClockView {

   private lateinit var viewPager: ViewPager
   private lateinit var tabLayout: TabLayout
   private lateinit var presenter: ClockPresenter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewPager = findViewById(R.id.viewPagerId)
        tabLayout = findViewById(R.id.tabLayoutId)

        tabLayout.setupWithViewPager(viewPager)
        presenter = ClockPresenter(this)
        presenter.attachView(this)
        presenter.loadData()


    }
    override fun setPagerAdapter(fragmentList: List<Fragment>,titleList: List<String>) {
        val adapter = TabAdapter(supportFragmentManager)

        for (i in 0..fragmentList.size-1) {
            adapter.addFragment(fragmentList[i], titleList[i])
        }
        viewPager.adapter = adapter

        
    }
}























/*adapter = TabAdapter(supportFragmentManager)
           adapter.addFragment(TabFragment().newInstance("Tab1"), "Tab 1")
           adapter.addFragment(TabFragment().newInstance("Tab2"), "Tab 2")
           adapter.addFragment(TabFragment().newInstance("Tab3"), "Tab 3")
   viewPager.adapter = adapter
       tabLayout.setupWithViewPager(viewPager)*/