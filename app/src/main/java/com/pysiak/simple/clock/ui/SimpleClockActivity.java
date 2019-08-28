package com.pysiak.simple.clock.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import com.pysiak.simple.clock.R;

import java.util.List;

/**
 * Main class, launcher activity for application, implementation of SimpleClockView
 * @author Yaroslav P.
 * {@link AppCompatActivity}
 * {@link SimpleClockView}
 */
public class SimpleClockActivity extends AppCompatActivity implements SimpleClockView {

    private ViewPager viewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tabLayout = findViewById(R.id.tab_layout_id);
        viewPager = findViewById(R.id.view_pager_id);
        ClockPresenter presenter = new ClockPresenter(this);
        presenter.attachView(this);
        presenter.loadData();
        tabLayout.setupWithViewPager(viewPager);
    }

    /**
     * Set values to View Pager Adapter
     * @see SimpleClockView#setPagerAdapter(List, List)
     * @param fragmentList Fragment value to be added to the list
     * @param titleList String title value to be added to the list
     * */
    @Override
    public void setPagerAdapter(List<Fragment> fragmentList, List<String> titleList) {
        TabAdapter adapter = new TabAdapter(getSupportFragmentManager());
        for (int i = 0; i < fragmentList.size(); i++) {
            adapter.addFragment(fragmentList.get(i), titleList.get(i));
        }
        if (fragmentList.isEmpty()|| titleList.isEmpty()) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Your list is Empty ", Toast.LENGTH_SHORT);
            toast.show();
            return;
        }
        viewPager.setAdapter(adapter);
    }
}
