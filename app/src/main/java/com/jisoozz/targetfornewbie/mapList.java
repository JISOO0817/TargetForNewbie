package com.jisoozz.targetfornewbie;

import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class mapList extends Fragment {


    private TextView tv1;
    private ImageView image1;
    private ImageView image2;
    private ImageView image3;
    private ImageView image4;
    private ImageView image5;


    Bundle map;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.maplist,container,false);
        tv1 = (TextView)rootView.findViewById(R.id.tv1);
        image1 = (ImageView)rootView.findViewById(R.id.image1);
        image2 = (ImageView)rootView.findViewById(R.id.image2);
        image3 = (ImageView)rootView.findViewById(R.id.image3);
        image4 = (ImageView)rootView.findViewById(R.id.image4);
        image5 = (ImageView)rootView.findViewById(R.id.image5);



        getNewMapList();



        return rootView;
    }



    public void getNewMapList(){

        String text = getArguments().getString("tv1");
        int image11 = getArguments().getInt("image1");
        int image22 = getArguments().getInt("image2");
        int image33 = getArguments().getInt("image3");
        int image44 = getArguments().getInt("image4");
        int image55 = getArguments().getInt("image5");


        map = new Bundle();
        map.putString("tv1",text);
        map.putInt("image1",image11);
        map.putInt("image2",image22);
        map.putInt("image3",image33);
        map.putInt("image4",image44);
        map.putInt("image5",image55);



        tv1.setText(text);
        image1.setImageResource(image11);
        image2.setImageResource(image22);
        image3.setImageResource(image33);
        image4.setImageResource(image44);
        image5.setImageResource(image55);



    //    image1.setImageResource(image1);



   //     tv1.setText(tv1+"");
     //   movieTitle.setText(title);
     //   movieRate.setText(rate);
     //   movieAge.setText(age+"");



    }



}
