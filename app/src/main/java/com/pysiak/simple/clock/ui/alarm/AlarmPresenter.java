package com.pysiak.simple.clock.ui.alarm;

import android.content.Context;
import android.support.v4.app.Fragment;
import com.pysiak.simple.clock.R;


import java.util.ArrayList;
import java.util.List;

/**
 * Presenter for my Alarm screen with {@link AlarmView}
 *
 * @author Yaroslav P.
 */
public class AlarmPresenter {

    private AlarmView alarmView;
    private Context context;

    public AlarmPresenter(Context context) {
        this.context = context;
    }

    /**
     * Attach instance of {@link AlarmView} to presenter
     *
     * @param alarmView instance of {@link AlarmView}
     */
    public void attachView(AlarmView alarmView) {
        this.alarmView = alarmView;
    }

    /**
     * Create new fragments and installed on PagerAdapter
     */
    public void loadData() {
        List<Fragment> fragmentList = new ArrayList<>();
        List<String> titleList = new ArrayList<>();

        fragmentList.add(new AlarmFragment());
        titleList.add(context.getString(R.string.Alarm));
        if (alarmView != null) {
            alarmView.setPagerAdapter(fragmentList, titleList);
        }
    }
}
