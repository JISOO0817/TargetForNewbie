package com.jisoozz.targetfornewbie;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class GameAdapter extends FragmentStatePagerAdapter {

    ArrayList<gameList> items3 = new ArrayList<gameList>();

    public GameAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public void addItem(gameList item){
        items3.add(item);
    }

    @NonNull
    @Override
    public gameList getItem(int position) {
        return items3.get(position);
    }

    @Override
    public int getCount() {
        return 5;
    }
}
