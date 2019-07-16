package com.example.alc40phase1;


import android.graphics.Color;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class Main2ActivityB extends AppCompatActivity {

    private WebView ALC4webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_b);
        getSupportActionBar().setTitle("About ALC");
        ALC4webView = findViewById(R.id.id_ALC_webview);


        ALC4webView.getSettings().setJavaScriptEnabled(true);
        ALC4webView.setWebViewClient(new WebViewClient());
        ALC4webView.setWebViewClient(new WebViewClient(){
        @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error){
                handler.proceed();
            }   });

        ALC4webView.loadUrl("https://andela.com/alc/");

        ALC4webView.setWebChromeClient(new WebChromeClient(){



        });
    }
}
