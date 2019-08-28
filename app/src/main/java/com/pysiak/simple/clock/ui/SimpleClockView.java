package com.pysiak.simple.clock.ui;

import android.support.v4.app.Fragment;

import java.util.List;

/**
 * This is interface for communicating SimpleClockActivity with ClockPresenter
 * Set values to View Pager Adapter
 * @author Yaroslav P.
 * param fragmentList Fragment value to be added to the list
 * param titleList String title value to be added to the list
 */
public interface SimpleClockView {
    void setPagerAdapter(List<Fragment> fragmentList, List<String> titleList);
}
