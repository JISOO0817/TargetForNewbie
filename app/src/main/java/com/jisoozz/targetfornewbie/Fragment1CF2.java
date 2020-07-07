package com.jisoozz.targetfornewbie;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;


public class Fragment1CF2 extends Fragment {



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment1cf2, container, false);


        ImageView ard = (ImageView) rootView.findViewById(R.id.iv);
        Glide.with(this).load(R.raw.ardard).into(ard);
        ImageView ard2 = rootView.findViewById(R.id.iv22);
        Glide.with(this).load(R.raw.sss).into(ard2);
        return rootView;
    }
}
