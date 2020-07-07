package com.jisoozz.targetfornewbie;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class YoutubeFragment extends Fragment {

    WebView myWebView;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View myView = inflater.inflate(R.layout.fragment_youtube,container,false);
        WebView myWebView = myView.findViewById(R.id.webView1);
        myWebView.loadUrl("https://www.youtube.com/channel/UCKcYqk0hDDbgHpmZVQWjDcQ?sub_confirmation=1");

        myWebView.setWebViewClient(new WebViewClient(){

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });


        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);



        return myView;

    }


    @Override
    public void onPause() {
        super.onPause();
        myWebView.onPause();
    }
}
