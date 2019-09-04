package com.pysiak.simple.clock.ui;

import android.content.Context;
import android.support.v4.app.Fragment;
import com.pysiak.simple.clock.R;
import com.pysiak.simple.clock.ui.alarm.AlarmFragment;
import com.pysiak.simple.clock.ui.clock.ClockFragment;
import com.pysiak.simple.clock.ui.stopwatch.StopWatchFragment;
import com.pysiak.simple.clock.ui.timer.TimerFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Presenter for my main clock screen with {@link SimpleClockView}
 *
 * @author Yaroslav P.
 */
public class SimpleClockPresenter {

    private SimpleClockView simpleClockView;
    private Context context;

    SimpleClockPresenter(Context context) {
        this.context = context;
    }

    /**
     * Attach instance of {@link SimpleClockView} to presenter
     *
     * @param simpleClockView instance of {@link SimpleClockView}
     */
  public void attachView(SimpleClockView simpleClockView) {
        this.simpleClockView = simpleClockView;
    }

    /**
     * This is a method for creating new fragments and installed on PagerAdapter
     */
    void loadData() {
        List<Fragment> fragmentList = new ArrayList<>();
        List<String> titleList = new ArrayList<>();
        List<Integer> iconList = new ArrayList<>();

        fragmentList.add(new AlarmFragment());
        fragmentList.add(new ClockFragment());
        fragmentList.add(new StopWatchFragment());
        fragmentList.add(new TimerFragment());
        titleList.add(context.getString(R.string.alarm_tab_title));
        titleList.add(context.getString(R.string.clock_tab_title));
        titleList.add(context.getString(R.string.stopwatch_tab_title));
        titleList.add(context.getString(R.string.timer_tab_title));
        iconList.add(R.drawable.ic_alarm_clock_48);
        iconList.add(R.drawable.ic_clock_48);
        iconList.add(R.drawable.ic_stopwatch_48);
        iconList.add(R.drawable.ic_timer_48);

        if (simpleClockView != null) {
            simpleClockView.setPagerAdapter(fragmentList, titleList, iconList);
        }
    }
}