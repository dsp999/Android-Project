package com.example.donpanditha.tripplannerv20;

/**
 * Created by donpanditha on 10/11/14.
 */
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


import com.example.donpanditha.tripplannerv20.Map.Map;
import com.example.donpanditha.tripplannerv20.Place.Place;
import com.example.donpanditha.tripplannerv20.Weather.Weather;

public class TabPagerAdapter extends FragmentStatePagerAdapter {
    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
        // TODO Auto-generated constructor stub
    }
    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                //Fragement for Android Tab
                return new Map();
            case 1:
                //Fragment for Ios Tab
                return new Weather();
            case 2:
                //Fragment for Windows Tab
                return new Place();
        }
        return null;
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return 3; //No of Tabs
    }
}