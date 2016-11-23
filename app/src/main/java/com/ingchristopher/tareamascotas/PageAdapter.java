package com.ingchristopher.tareamascotas;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Ing. Christopher on 20/11/2016.
 */

public class PageAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment>fragments;

    public PageAdapter(FragmentManager fm, ArrayList<Fragment>fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
