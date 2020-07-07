package com.jisoozz.targetfornewbie;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class BaroPagerAdapter extends FragmentPagerAdapter {



    final int pageCount = 3;
    private String tabTitles[] = new String[]{"YOUTUBE","CAFE","TWITTER"};

    public BaroPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:
                return new YoutubeFragment();
            case 1:
                return new CafeFragment();
            case 2:
                return new TwiterFragment();
                default:
                    return null;
        }

    }

    @Override
    public int getCount() {
        return pageCount;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
