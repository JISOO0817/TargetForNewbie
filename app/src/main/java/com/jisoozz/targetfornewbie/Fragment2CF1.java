package com.jisoozz.targetfornewbie;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class Fragment2CF1 extends Fragment {

    MapAdapter mapAdapter;
    ViewPager pager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment2cf1, container, false);




        TabLayout t1 = rootView.findViewById(R.id.tab);
        pager = rootView.findViewById(R.id.vp);
        //pager.setOffscreenPageLimit(1);
        pager.setAdapter(mapAdapter);
        t1.setupWithViewPager(pager);
        ArrayList<String> name = new ArrayList<>();
        name.add("1");
        name.add("2");
        name.add("3");
        name.add("4");
        name.add("5");
        name.add("6");
        name.add("7");
        name.add("8");
        name.add("9");

        for(int i=0; i<9; i++){
            t1.getTabAt(i).setText(name.get(i));
        }


/*
        ArrayList<Integer> images = new ArrayList<>();
        images.add()
        images.add(R.drawable.seongsim);
        images.add(R.drawable.bartender);

        for(int i=0; i<3; i++)
            t1.getTabAt(i).setIcon(images.get(i));
*/

        return rootView;
    }


    public void setPager(MapAdapter adapter){
        mapAdapter = adapter;
    }



}
