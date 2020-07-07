package com.jisoozz.targetfornewbie;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.fragment.app.Fragment;


public class TwiterFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

      View myView = inflater.inflate(R.layout.fragment_twiter,container,false);
        WebView myWebView3 = myView.findViewById(R.id.webView3);
        myWebView3.loadUrl("https://twitter.com/identity5kr");

        myWebView3.setWebViewClient(new WebViewClient(){

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });


        WebSettings webSettings = myWebView3.getSettings();
        webSettings.setJavaScriptEnabled(true);



        return myView;

    }




}
