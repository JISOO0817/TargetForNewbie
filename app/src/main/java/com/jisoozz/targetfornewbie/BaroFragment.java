package com.jisoozz.targetfornewbie;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class BaroFragment extends Fragment {






    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.barofragment, container, false);
        ViewPager viewPager = rootView.findViewById(R.id.viewPager);
        BaroPagerAdapter pa = new BaroPagerAdapter(getChildFragmentManager());
        viewPager.setAdapter(pa);

        TabLayout tl = rootView.findViewById(R.id.sliding_tabs);
        tl.setupWithViewPager(viewPager);
        return rootView;
    }





}
