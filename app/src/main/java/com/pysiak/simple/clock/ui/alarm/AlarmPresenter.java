package com.pysiak.simple.clock.ui.alarm;

/**
 * Presenter for my Alarm fragment with {@link AlarmView}
 *
 * @author Yaroslav P.
 */
public class AlarmPresenter {

    private AlarmView alarmView;
    private AlarmFragment alarmFragment;

    AlarmPresenter(AlarmFragment alarmFragment) {
        this.alarmFragment = alarmFragment;
    }

    /**
     * Attach instance of {@link AlarmView} to presenter
     *
     * @param alarmView instance of {@link AlarmView}
     */
    public void attachView(AlarmView alarmView) {
        this.alarmView = alarmView;
    }
}
