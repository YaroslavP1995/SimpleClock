package com.pysiak.simple.clock.ui.alarm;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pysiak.simple.clock.R;

/**
 * Alarm Fragment implementation {@link AlarmView}
 *
 * @author Yaroslav P.
 * {@link Fragment}
 */
public class AlarmFragment extends Fragment implements AlarmView{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.alarm_fragment,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        AlarmPresenter alarmPresenter = new AlarmPresenter(this);
        alarmPresenter.attachView(this);
        super.onViewCreated(view, savedInstanceState);
    }
}
