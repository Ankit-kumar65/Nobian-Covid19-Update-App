
package com.example.nobiancovid_19update;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class activity6 extends AppCompatActivity {
   PDFView pdfView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity6);

        pdfView=findViewById(R.id.pdfView);
        pdfView.fromAsset("Microsoft Word - Detail Question and Answer COVID-19 _1_.pdf")
        .load();




    }
}