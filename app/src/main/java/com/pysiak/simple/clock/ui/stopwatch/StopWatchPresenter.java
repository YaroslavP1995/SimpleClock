package com.pysiak.simple.clock.ui.stopwatch;

import android.content.Context;
import android.support.v4.app.Fragment;
import com.pysiak.simple.clock.R;
import java.util.ArrayList;
import java.util.List;

/**
 * Presenter for my main clock screen with {@link StopWatchView}
 *
 * @author Yaroslav P.
 */
public class StopWatchPresenter {

    private StopWatchView stopWatchView;
    private Context context;

    public StopWatchPresenter(Context context) {
        this.context = context;
    }

    /**
     * Attach instance of {@link StopWatchView} to presenter
     *
     * @param stopWatchView instance of {@link StopWatchView}
     */
    public   void attachView(StopWatchView stopWatchView) {
        this.stopWatchView = stopWatchView;
    }

    /**
     * Create new fragments and installed on PagerAdapter
     */
    public void loadData() {
        List<Fragment> fragmentList = new ArrayList<>();
        List<String> titleList = new ArrayList<>();

        fragmentList.add(new StopWatchFragment());
        titleList.add(context.getString(R.string.Stopwatch));
        if (stopWatchView != null) {
            stopWatchView.setPagerAdapter(fragmentList, titleList);
        }
    }
}
