package com.example.nobiancovid_19update;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class activity4 extends AppCompatActivity {
    private WebView mWebView;
    private Button b101;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity4);
        mWebView = (WebView) findViewById(R.id.covid);

        mWebView.setWebViewClient(new WebViewClient());
        mWebView.loadUrl("https://www.worldometers.info/coronavirus/?utm_campaign=homeAdvegas1?");

        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        mWebView.getSettings().setDomStorageEnabled(true);



        b101=(Button) findViewById(R.id.b10);
        b101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity8();

            }

            private void openactivity8() {
                Intent intent = new Intent(activity4.this, activity8.class);
                startActivity(intent);

            } });



    }
}