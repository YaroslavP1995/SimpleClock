package com.pysiak.simple.clock.ui.timer;

/**
 * Presenter for my Timer fragment with {@link TimerView}
 *
 * @author Yaroslav P.
 */
public class TimerPresenter {

    private TimerView timerView;
    private TimerFragment timerFragment;

    TimerPresenter(TimerFragment timerFragment) {
        this.timerFragment = timerFragment;
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
