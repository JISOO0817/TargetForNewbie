package com.jisoozz.targetfornewbie;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class Fragment2CF2 extends Fragment {

    SponAdapter sponAdapter;
    ViewPager pager2;
    ArrayList<String> s;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment2cf2, container, false);


        TabLayout t2 = (TabLayout)rootView.findViewById(R.id.tab2);
        pager2 = rootView.findViewById(R.id.vp2);
        pager2.setAdapter(sponAdapter);
        t2.setupWithViewPager(pager2);

        ArrayList<String> s = new ArrayList<>();

        s.add("1");
        s.add("2");
        s.add("3");
        s.add("4");
        s.add("5");
        s.add("6");
        s.add("7");
        s.add("8");
        s.add("9");


        for(int i=0; i<9; i++){
            t2.getTabAt(i).setText(s.get(i));
        }
        return rootView;
    }

    public void setPager2(SponAdapter adapter2){
        sponAdapter = adapter2;
    }

}
