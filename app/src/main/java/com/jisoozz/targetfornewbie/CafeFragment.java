package com.jisoozz.targetfornewbie;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.fragment.app.Fragment;


public class CafeFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View myView = inflater.inflate(R.layout.fragment_cafe,container,false);
        WebView myWebView2 = myView.findViewById(R.id.webView2);
        myWebView2.loadUrl("https://cafe.naver.com/identity5");

        myWebView2.setWebViewClient(new WebViewClient(){

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });


        WebSettings webSettings = myWebView2.getSettings();
        webSettings.setJavaScriptEnabled(true);



        return myView;

    }

}
