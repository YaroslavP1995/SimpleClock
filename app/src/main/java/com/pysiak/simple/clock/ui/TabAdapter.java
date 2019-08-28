package com.pysiak.simple.clock.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yaroslav P.
 * Super class for implementation my TabAdapter {@link FragmentStatePagerAdapter}
 * */
public class TabAdapter extends FragmentStatePagerAdapter {
    private final List<Fragment> fragmentList = new ArrayList<>();
    private final List<String> fragmentTitleList = new ArrayList<>();

    /**
     * Default constructor for TabAdapter class
     * */
    public TabAdapter(FragmentManager fm) {
        super(fm);
    }

    /**
     * @see FragmentStatePagerAdapter#getItem(int)
     * @param position this is the position of my fragment in the list
     * @return int position fragment from list.
     * */
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    /**
     * A method for creating a list and structure for adding it to a list
     * @param fragment fragment value to be added to the list
     * @param title String value to be added to the list
     * */
    public void addFragment(Fragment fragment, String title) {
        fragmentList.add(fragment);
        fragmentTitleList.add(title);
    }

    /**
     * @see FragmentStatePagerAdapter#getPageTitle(int)
     * @param position this is the position of my String title in the list
     * @return int position title from list
     * */
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitleList.get(position);
    }

    /**
     * @see FragmentStatePagerAdapter#getCount()
     * @return size list fragment
     * */
    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
