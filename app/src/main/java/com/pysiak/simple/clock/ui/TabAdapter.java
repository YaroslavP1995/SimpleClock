package com.pysiak.simple.clock.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Provides fragments and tab titles to view pager associated with tab layout
 * @author Yaroslav P.
 * Super class for implementation my TabAdapter {@link FragmentStatePagerAdapter}
 */
public class TabAdapter extends FragmentStatePagerAdapter {
    private final List<Fragment> fragmentList = new ArrayList<>();
    private final List<String> fragmentTitleList = new ArrayList<>();

    TabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    /**
     * A method for creating a list and structure for adding it to a list
     * @param fragment fragment value to be added to the list
     * @param title String value to be added to the list
     */
    void addFragment(Fragment fragment, String title) {
        fragmentList.add(fragment);
        fragmentTitleList.add(title);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitleList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
