package com.pysiak.simple.clock.ui.clock;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextClock;
import android.widget.TextView;
import com.pysiak.simple.clock.R;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Fragment that implements {@link ClockView}
 *
 * @author Yaroslav P.
 */
public class ClockFragment extends Fragment implements ClockView {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.clock_fragment, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ClockPresenter clockPresenter = new ClockPresenter();
        clockPresenter.attachView(this);

    }
}
