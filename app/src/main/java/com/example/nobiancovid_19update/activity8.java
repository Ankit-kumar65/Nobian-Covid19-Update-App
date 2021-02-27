package com.example.nobiancovid_19update;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;



public class activity8 extends AppCompatActivity {
    private WebView mWebView;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity8);
        mWebView = (WebView) findViewById(R.id.covid);

        mWebView.setWebViewClient(new WebViewClient());
        mWebView.loadUrl("https://www.who.int/emergencies/diseases/novel-coronavirus-2019/situation-reports");

        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        mWebView.getSettings().setDomStorageEnabled(true);


        mWebView.setDownloadListener(new DownloadListener() {
            public void onDownloadStart(String url, String userAgent,
                                        String contentDisposition, String mimetype,
                                        long contentLength) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.who.int/emergencies/diseases/novel-coronavirus-2019/situation-reports"));
                startActivity(i);
            }
        });






    }
}