package com.pysiak.simple.clock.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import com.pysiak.simple.clock.R;
import com.pysiak.simple.clock.ui.alarm.AlarmPresenter;
import com.pysiak.simple.clock.ui.alarm.AlarmView;
import com.pysiak.simple.clock.ui.clock.ClockPresenter;
import com.pysiak.simple.clock.ui.clock.ClockView;
import com.pysiak.simple.clock.ui.stopwatch.StopWatchView;
import com.pysiak.simple.clock.ui.timer.TimerView;

import java.util.List;

/**
 * Main class, launcher activity for application, implementation of {@link ClockView}
 *
 * @author Yaroslav P.
 */
public class ClockActivity extends AppCompatActivity implements AlarmView, ClockView, StopWatchView, TimerView {

    private ViewPager viewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tabLayout = findViewById(R.id.tab_layout_id);
        viewPager = findViewById(R.id.view_pager_id);
        AlarmPresenter alarmPresenter = new AlarmPresenter(this);
        alarmPresenter.attachView(this);
        alarmPresenter.loadData();
        ClockPresenter clockPresenter = new ClockPresenter(this);
        clockPresenter.attachView(this);
        clockPresenter.loadData();
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public void setPagerAdapter(List<Fragment> fragmentList, List<String> titleList) {
        if (fragmentList != null && titleList != null && fragmentList.size() == titleList.size()) {
            TabAdapter adapter = new TabAdapter(getSupportFragmentManager());
            for (int i = 0; i < fragmentList.size(); i++) {
                adapter.addFragment(fragmentList.get(i), titleList.get(i));
            }
            viewPager.setAdapter(adapter);
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "Check your list size", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
