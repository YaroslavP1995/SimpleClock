package com.pysiak.simple.clock.ui.clock;

import android.content.Context;
import android.support.v4.app.Fragment;
import com.pysiak.simple.clock.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Presenter for my main clock screen with {@link ClockView}
 *
 * @author Yaroslav P.
 */
public class ClockPresenter {

    private ClockView clockView;
    private Context context;

   public ClockPresenter(Context context) {
        this.context = context;
    }

    /**
     * Attach instance of {@link ClockView} to presenter
     *
     * @param clockView instance of {@link ClockView}
     */
  public void attachView(ClockView clockView) {
        this.clockView = clockView;
    }

    /**
     * This is a method for creating new fragments and installed on PagerAdapter
     */
  public void loadData() {
        List<Fragment> fragmentList = new ArrayList<>();
        List<String> titleList = new ArrayList<>();

        fragmentList.add(new ClockFragment());
        titleList.add(context.getString(R.string.Clock));
        if (clockView != null) {
            clockView.setPagerAdapter(fragmentList, titleList);
        }
    }
}
