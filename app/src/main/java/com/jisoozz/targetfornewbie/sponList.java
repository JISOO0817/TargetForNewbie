package com.jisoozz.targetfornewbie;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class sponList extends Fragment {


    private TextView tv;
    private ImageView img1;



    Bundle spon;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.sponlist,container,false);
        tv = (TextView)rootView.findViewById(R.id.tv);
        img1 = (ImageView)rootView.findViewById(R.id.image1);




        getNewSponList();



        return rootView;
    }



    public void getNewSponList(){

        String text2 = getArguments().getString("tv");
        int img11 = getArguments().getInt("img1");


        spon = new Bundle();
        spon.putString("tv",text2);
        spon.putInt("img1",img11);




        tv.setText(text2);
        img1.setImageResource(img11);



    //    image1.setImageResource(image1);



   //     tv1.setText(tv1+"");
     //   movieTitle.setText(title);
     //   movieRate.setText(rate);
     //   movieAge.setText(age+"");



    }



}
