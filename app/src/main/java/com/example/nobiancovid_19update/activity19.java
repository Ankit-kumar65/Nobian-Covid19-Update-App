package com.example.nobiancovid_19update;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;



public class activity19 extends AppCompatActivity {
    private WebView mWebView;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity19);
        mWebView = (WebView) findViewById(R.id.covid);

        mWebView.setWebViewClient(new WebViewClient());
        mWebView.loadUrl("https://www.instagram.com/vegan_nobi/");

        mWebView.getSettings().setJavaScriptEnabled(true);


        mWebView.getSettings().setSupportMultipleWindows(true);
        mWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        mWebView.getSettings().setDomStorageEnabled(true);






    }
}