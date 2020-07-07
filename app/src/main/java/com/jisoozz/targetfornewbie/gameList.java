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

public class gameList extends Fragment {


    private ImageView ima;


    Bundle game;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.gamelist,container,false);

        ima = (ImageView)rootView.findViewById(R.id.ima);




        getNewGameList();



        return rootView;
    }



    public void getNewGameList(){


        int image111 = getArguments().getInt("ima");



        game = new Bundle();

        game.putInt("ima",image111);

        ima.setImageResource(image111);




    //    image1.setImageResource(image1);



   //     tv1.setText(tv1+"");
     //   movieTitle.setText(title);
     //   movieRate.setText(rate);
     //   movieAge.setText(age+"");



    }



}
