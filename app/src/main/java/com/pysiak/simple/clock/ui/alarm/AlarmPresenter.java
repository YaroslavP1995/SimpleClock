package com.pysiak.simple.clock.ui.alarm;

/**
 * Presenter for alarm tab.
 *
 * @author Yaroslav P.
 */
public class AlarmPresenter {

    private AlarmView alarmView;

    AlarmPresenter() {
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
