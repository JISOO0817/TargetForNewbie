package com.jisoozz.targetfornewbie;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Fragmenth extends Fragment {

    TextView tv;
    RecyclerView recyclerView_h;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragmenth, container, false);

        recyclerView_h = rootView.findViewById(R.id.recyclerView_h);
        tv = rootView.findViewById(R.id.tv);

        String str = "'로렘입숨'님의 티어표를 참고하였습니다.";
        tv = rootView.findViewById(R.id.tv);
        SpannableStringBuilder ssb = new SpannableStringBuilder(str);
        ssb.setSpan(new ForegroundColorSpan(Color.parseColor("#A2C6F3")),1,5, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv.setText(ssb);



        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL,false);
        recyclerView_h.setLayoutManager(layoutManager);


        showHunter();



        return rootView;
    }

    private void showHunter() {

        final HunterAdapter adapter = new HunterAdapter();

        adapter.addItem(new Hunter(R.drawable.antonio,"S티어","바이올리니스트","안토니오"));
        adapter.addItem(new Hunter(R.drawable.bonbon,"S티어","수위26호","봉봉"));
        adapter.addItem(new Hunter(R.drawable.mary,"S티어","블러디 퀸","마리"));
        adapter.addItem(new Hunter(R.drawable.joker,"S티어","광대","조커"));
        adapter.addItem(new Hunter(R.drawable.bark,"S티어","광기의 눈","발크"));
        adapter.addItem(new Hunter(R.drawable.idyra,"S티어","꿈의 마녀","이드라"));
        adapter.addItem(new Hunter(R.drawable.haster,"A티어","바이올리니스트","하스터"));
        adapter.addItem(new Hunter(R.drawable.wuchang,"A티어","우산의 영혼","우산"));
        adapter.addItem(new Hunter(R.drawable.bane,"A티어","사냥터지기","베인"));
        adapter.addItem(new Hunter(R.drawable.joshep,"A티어","사진사","요셉"));
        adapter.addItem(new Hunter(R.drawable.robbie,"A티어","울보","로비"));
        adapter.addItem(new Hunter(R.drawable.violetta,"A티어","거미","비올레타"));
        adapter.addItem(new Hunter(R.drawable.ahn,"B티어","'사도'","안"));
        adapter.addItem(new Hunter(R.drawable.jack,"B티어","리퍼","잭"));
        adapter.addItem(new Hunter(R.drawable.lukino,"B티어","재앙의 도마뱀","루키노"));
        adapter.addItem(new Hunter(R.drawable.michico,"C티어","붉은 나비","미치코"));
        adapter.addItem(new Hunter(R.drawable.leo,"C티어","공장장","레오"));




        recyclerView_h.setAdapter(adapter);

    }
}
