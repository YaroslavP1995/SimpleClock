package com.pysiak.simple.clock.presenter

import android.support.v4.app.Fragment

interface SimpleClockView {
    fun setPagerAdapter(fragmentList: List<Fragment>,titleList: List<String>)
}
