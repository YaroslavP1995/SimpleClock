package com.pysiak.simple.clock.ui;

import android.content.Context;
import android.support.v4.app.Fragment;
import com.pysiak.simple.clock.R;

import java.util.ArrayList;
import java.util.List;

public class ClockPresenter {

    private SimpleClockView simpleClockView;
    private Context context;

    public ClockPresenter(Context context) {
        this.context = context;
    }

    public void attacchView(SimpleClockView simpleClockView){
        this.simpleClockView = simpleClockView;
    }
    public void loadData(){
        List<Fragment> fragmentList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        fragmentList.add(new TabFragment());
        fragmentList.add(new TabFragment());
        fragmentList.add(new TabFragment());
        stringList.add(context.getString(R.string.tab1));
        stringList.add(context.getString(R.string.tab2));
        stringList.add(context.getString(R.string.tab3));

        simpleClockView.setPagerAdapter(fragmentList,stringList);
    }
}
