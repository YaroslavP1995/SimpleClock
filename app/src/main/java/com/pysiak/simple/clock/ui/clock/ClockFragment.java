package com.pysiak.simple.clock.ui.clock;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pysiak.simple.clock.R;

/**
 * Clock Fragment implementation {@link ClockView}
 *
 * @author Yaroslav P.
 * {@link Fragment}
 */
public class ClockFragment extends Fragment implements ClockView {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.clock_fragment,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        ClockPresenter clockPresenter = new ClockPresenter(this);
        clockPresenter.attachView(this);
        super.onViewCreated(view, savedInstanceState);
    }
}
