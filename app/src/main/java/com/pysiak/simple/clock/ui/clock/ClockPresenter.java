package com.pysiak.simple.clock.ui.clock;

/**
 * Presenter for clock tab.
 *
 * @author Yaroslav P.
 */
public class ClockPresenter {

    private ClockView clockView;

    ClockPresenter() {
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
