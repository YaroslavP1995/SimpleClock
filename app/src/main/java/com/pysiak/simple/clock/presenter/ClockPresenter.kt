package com.pysiak.simple.clock.presenter

import android.content.Context
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import com.pysiak.simple.clock.R
import com.pysiak.simple.clock.ui.SimpleClockActivity
import java.util.ArrayList


class ClockPresenter (val context: Context){

    private var simpleClockView: SimpleClockView? = null


    fun attachView(simpleClockView: SimpleClockView) {
        this.simpleClockView = simpleClockView
    }
     fun loadData() {
         val fragmentList = ArrayList<Fragment>()
         val stringList = ArrayList<String>()
         fragmentList.add(TabFragment())
         fragmentList.add(TabFragment())
         fragmentList.add(TabFragment())
         stringList.add(context.getString(R.string.tab1))
         stringList.add(context.getString(R.string.tab2))
         stringList.add(context.getString(R.string.tab3))


         simpleClockView?.setPagerAdapter(fragmentList,stringList)
    }

}












/*private val clockPresenter: List<Fragment>

    get() {
        val fList = ArrayList<Fragment>()
        fList.add(TabFragment().newInstance("Tab1"))
        fList.add(TabFragment().newInstance("Tab2"))
        fList.add(TabFragment().newInstance("Tab3"))
        return fList
    }*/