package com.jisoozz.targetfornewbie;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class SponAdapter extends FragmentStatePagerAdapter {

    ArrayList<sponList> items2 = new ArrayList<sponList>();

    public SponAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public void addItem(sponList item2){
        items2.add(item2);
    }

    @NonNull
    @Override
    public sponList getItem(int position) {
        return items2.get(position);
    }

    @Override
    public int getCount() {
        return 9;
    }
}
