package com.pysiak.simple.clock.ui.timer;

import android.content.Context;
import android.support.v4.app.Fragment;
import com.pysiak.simple.clock.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Presenter for my main clock screen with {@link TimerView}
 *
 * @author Yaroslav P.
 */
public class TimerPresenter {

    private TimerView timerView;
    private Context context;

    public TimerPresenter(Context context) {
        this.context = context;
    }

    /**
     * Attach instance of {@link TimerView} to presenter
     *
     * @param timerView instance of {@link TimerView}
     */
    public   void attachView(TimerView timerView) {
        this.timerView = timerView;
    }

    /**
     * Create new fragments and installed on PagerAdapter
     */
    public void loadData(){
        List<Fragment> fragmentList = new ArrayList<>();
        List<String> titleList = new ArrayList<>();

        fragmentList.add(new TimerFragment());
        titleList.add(context.getString(R.string.Stopwatch));
        if (timerView != null) {
            timerView.setPagerAdapter(fragmentList, titleList);
        }
    }

}
