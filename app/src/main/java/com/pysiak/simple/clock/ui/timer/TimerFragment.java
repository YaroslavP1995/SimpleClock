package com.pysiak.simple.clock.ui.timer;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pysiak.simple.clock.R;

/**
 * Timer Fragment implementation {@link TimerView}
 *
 * @author Yaroslav P.
 * {@link Fragment}
 */
public class TimerFragment extends Fragment implements TimerView {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.timer_fragment,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        TimerPresenter timerPresenter = new TimerPresenter(this);
        timerPresenter.attachView(this);
        super.onViewCreated(view, savedInstanceState);
    }
}
