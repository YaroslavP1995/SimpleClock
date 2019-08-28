package com.pysiak.simple.clock.ui;

import android.content.Context;
import android.support.v4.app.Fragment;
import com.pysiak.simple.clock.R;

import java.util.ArrayList;
import java.util.List;
/**
 * Class for implementing the architecture of the MVP
 * for communicating with SimpleClockActivity
 * @author Yaroslav P.
 */
public class ClockPresenter {

    private SimpleClockView simpleClockView;
    private Context context;

    public ClockPresenter(Context context) {
        this.context = context;
    }

    /**
     * Method for communicating with SimpleClockActivity through the interface SimpleClockView
     * @param simpleClockView value for communicating with SimpleClockActivity
     */
    public void attachView(SimpleClockView simpleClockView) {
        this.simpleClockView = simpleClockView;
    }

    /**
     * This is a method for creating new fragments and installed on PagerAdapter
     */
    public void loadData() {
        List<Fragment> fragmentList = new ArrayList<>();
        List<String> titleList = new ArrayList<>();

        fragmentList.add(new TabFragment());
        fragmentList.add(new TabFragment());
        fragmentList.add(new TabFragment());
        titleList.add(context.getString(R.string.tab1));
        titleList.add(context.getString(R.string.tab2));
        titleList.add(context.getString(R.string.tab3));

        simpleClockView.setPagerAdapter(fragmentList, titleList);
    }
}
