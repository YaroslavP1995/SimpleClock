package com.pysiak.simple.clock.ui;

import android.support.v4.app.Fragment;

import java.util.List;

public interface AlarmView {

    void setPagerAdapter(List<Fragment> fragmentList, List<String> titleList);

}
