package com.pysiak.simple.clock.ui;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.material.tabs.TabLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;
import com.pysiak.simple.clock.R;
import java.util.List;

/**
 * Main class, launcher activity for application, implementation of {@link SimpleClockView}
 *
 * @author Yaroslav P.
 */
public class SimpleClockActivity extends AppCompatActivity implements SimpleClockView {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.tab_layout_id);
        viewPager = findViewById(R.id.view_pager_id);
        tabLayout.setupWithViewPager(viewPager);
        SimpleClockPresenter simpleclockPresenter = new SimpleClockPresenter(this);
        simpleclockPresenter.attachView(this);
        simpleclockPresenter.loadData();
    }

    @Override
    public void setPagerAdapter(List<Fragment> fragmentList, List<String> titleList, List<Integer> iconList) {
        if (fragmentList != null && titleList != null && fragmentList.size() == titleList.size()) {
            TabAdapter adapter = new TabAdapter(getSupportFragmentManager());
            for (int i = 0; i < fragmentList.size(); i++) {
                adapter.addFragment(fragmentList.get(i), titleList.get(i));
            }
            viewPager.setAdapter(adapter);
            if (iconList != null && tabLayout.getTabCount() == iconList.size()) {
                for (int j = 0; j < iconList.size(); j++){
                    tabLayout.getTabAt(j).setIcon(iconList.get(j));
                }
            }
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "Check your list size", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
