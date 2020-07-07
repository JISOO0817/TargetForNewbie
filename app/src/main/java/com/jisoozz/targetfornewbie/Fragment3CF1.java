package com.jisoozz.targetfornewbie;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class Fragment3CF1 extends Fragment {


    GameAdapter gameAdapter;
    ViewPager pager3;
    ArrayList<String> g;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment3cf1, container, false);


        TabLayout t3 = (TabLayout)rootView.findViewById(R.id.tab3);
        pager3 = rootView.findViewById(R.id.vp3);
        pager3.setAdapter(gameAdapter);
        t3.setupWithViewPager(pager3);

        ArrayList<String> g = new ArrayList<>();

        g.add("의지");
        g.add("귀집");
        g.add("맵맛플");
        g.add("숨꼭");
        g.add("바상");



        for(int i=0; i<5; i++){
            t3.getTabAt(i).setText(g.get(i));
        }
        return rootView;
    }

    public void setPager3(GameAdapter adapter3){
        gameAdapter = adapter3;
    }

}
