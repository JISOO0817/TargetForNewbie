package com.jisoozz.targetfornewbie;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class MapAdapter extends FragmentStatePagerAdapter {

    ArrayList<mapList> items = new ArrayList<mapList>();

    public MapAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public void addItem(mapList item){
        items.add(item);
    }

    @NonNull
    @Override
    public mapList getItem(int position) {
        return items.get(position);
    }

    @Override
    public int getCount() {
        return 9;
    }
}
