package com.pysiak.simple.clock.ui;

import android.support.v4.app.Fragment;

import java.util.List;
/***
 * This is interface for communicating SimpleClockActivity with ClockPresenter
 * */
public interface SimpleClockView {
    void setPagerAdapter(List<Fragment> fragmentList, List<String> titleList);
}
