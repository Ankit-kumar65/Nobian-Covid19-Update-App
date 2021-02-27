package com.example.nobiancovid_19update;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;


public class activity3 extends AppCompatActivity {
    private WebView mWebView;

   private Button b77;
   private Button b99;
   private Button b78;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity3);
        mWebView = (WebView) findViewById(R.id.covid);

        mWebView.setWebViewClient(new WebViewClient());
        mWebView.loadUrl("https://www.covid19india.org/");






        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        mWebView.getSettings().setUseWideViewPort(true);
        mWebView.getSettings().setLoadWithOverviewMode(true);

        mWebView.getSettings().setDomStorageEnabled(true);
        final Activity activity = this;

        mWebView.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(activity, description, Toast.LENGTH_SHORT).show();
            }


        });




        b77=(Button) findViewById(R.id.b7);
        b77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity5();

            }

            private void openactivity5() {
                Intent intent = new Intent(activity3.this, activity5.class);
                startActivity(intent);

            } });


        b99=(Button) findViewById(R.id.b9);
        b99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity7();

            }

            private void openactivity7() {
                Intent intent = new Intent(activity3.this, activity7.class);
                startActivity(intent);

            } });


        b78=(Button) findViewById(R.id.b90);
        b78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity21();

            }

            private void openactivity21() {
                Intent intent = new Intent(activity3.this, activity21.class);
                startActivity(intent);

            } });





    }
}