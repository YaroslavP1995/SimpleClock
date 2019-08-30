package com.pysiak.simple.clock.ui.clock;

/**
 * Presenter for my Alarm fragment with {@link ClockView}
 *
 * @author Yaroslav P.
 */
public class ClockPresenter {

    private ClockView clockView;
    private ClockFragment clockFragment;

    ClockPresenter(ClockFragment clockFragment) {
        this.clockFragment = clockFragment;
    }

    /**
     * Attach instance of {@link ClockView} to presenter
     *
     * @param clockView instance of {@link ClockView}
     */
    public void attachView(ClockView clockView) {
        this.clockView = clockView;
    }
}
