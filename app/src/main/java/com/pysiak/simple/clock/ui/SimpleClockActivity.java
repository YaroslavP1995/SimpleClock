package com.pysiak.simple.clock.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import com.pysiak.simple.clock.R;

import java.util.List;

public class SimpleClockActivity extends AppCompatActivity implements SimpleClockView {

    private ViewPager viewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = findViewById(R.id.tabLayoutId);
        viewPager = findViewById(R.id.viewPagerId);

        ClockPresenter presenter = new ClockPresenter(this);
                 presenter.attacchView(this);
                 presenter.loadData();
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public void setPagerAdapter(List<Fragment> fragmentList, List<String> titleList) {
        TabAdapter adapter = new TabAdapter(getSupportFragmentManager());
        for (int i = 0;i < fragmentList.size();i++){
            adapter.addFragment(fragmentList.get(i), titleList.get(i));
        }
        viewPager.setAdapter(adapter) ;
    }
}
