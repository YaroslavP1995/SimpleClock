package com.pysiak.simple.clock.ui.stopwatch;

/**
 * Presenter for stopwatch screen.
 *
 * @author Yaroslav P.
 */
public class StopWatchPresenter {

    private StopWatchView stopWatchView;

    StopWatchPresenter() {
    }

    /**
     * Attach instance of {@link StopWatchView} to presenter
     *
     * @param stopWatchView instance of {@link StopWatchView}
     */
    public void attachView(StopWatchView stopWatchView) {
        this.stopWatchView = stopWatchView;
    }
}
