package com.pysiak.simple.clock.ui;

import android.content.Context;
import android.support.v4.app.Fragment;
import com.pysiak.simple.clock.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Presenter for my main clock screen with {@link SimpleClockView}
 *
 * @author Yaroslav P.
 */
class ClockPresenter {

    private SimpleClockView simpleClockView;
    private Context context;

    ClockPresenter(Context context) {
        this.context = context;
    }

    /**
     * Attach instance of {@link SimpleClockView} to presenter
     *
     * @param simpleClockView instance of {@link SimpleClockView}
     */
    void attachView(SimpleClockView simpleClockView) {
        this.simpleClockView = simpleClockView;
    }

    /**
     * This is a method for creating new fragments and installed on PagerAdapter
     */
    void loadData() {
        List<Fragment> fragmentList = new ArrayList<>();
        List<String> titleList = new ArrayList<>();

        fragmentList.add(new TabFragment());
        fragmentList.add(new TabFragment());
        fragmentList.add(new TabFragment());
        titleList.add(context.getString(R.string.tab1));
        titleList.add(context.getString(R.string.tab2));
        titleList.add(context.getString(R.string.tab3));

        if (simpleClockView != null) {
            simpleClockView.setPagerAdapter(fragmentList, titleList);
        }
    }
}
