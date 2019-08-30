package com.pysiak.simple.clock.ui.stopwatch;

/**
 * Presenter for my StopWatch fragment with {@link StopWatchView}
 *
 * @author Yaroslav P.
 */
public class StopWatchPresenter {

    private StopWatchView stopWatchView;
    private StopWatchFragment stopWatchFragment;

    StopWatchPresenter(StopWatchFragment stopWatchFragment) {
        this.stopWatchFragment = stopWatchFragment;
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
