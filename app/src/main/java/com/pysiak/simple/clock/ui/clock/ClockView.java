package com.pysiak.simple.clock.ui.clock;

import android.support.v4.app.Fragment;

import java.util.List;

/**
 * Defines contract for main clock screen.
 *
 * @author Yaroslav P.
 */
public interface ClockView {

    /**
     * Set values to View Pager Adapter
     *
     * @param fragmentList list of fragments to be added to the adapter
     * @param titleList list of titles to be added to the adapter
     */
    void setPagerAdapter(List<Fragment> fragmentList, List<String> titleList);
}
