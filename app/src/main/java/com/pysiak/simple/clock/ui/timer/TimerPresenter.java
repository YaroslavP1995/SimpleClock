package com.pysiak.simple.clock.ui.timer;

/**
 * Presenter for timer screen.
 *
 * @author Yaroslav P.
 */
public class TimerPresenter {

    private TimerView timerView;

    TimerPresenter() {
    }

    /**
     * Attach instance of {@link TimerView} to presenter
     *
     * @param timerView instance of {@link TimerView}
     */
    public   void attachView(TimerView timerView) {
        this.timerView = timerView;
    }
}
