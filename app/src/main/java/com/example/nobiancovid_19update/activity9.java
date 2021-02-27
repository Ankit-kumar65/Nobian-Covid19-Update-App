package com.example.nobiancovid_19update;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class activity9 extends AppCompatActivity {


    private Button b23;
    private Button b24;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity9);







        b23=(Button) findViewById(R.id.b14);
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity11();

            }

            private void openactivity11() {
                Intent intent = new Intent(activity9.this, activity11.class);
                startActivity(intent);

            } });


        b24=(Button) findViewById(R.id.b15);
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity12();

            }

            private void openactivity12() {
                Intent intent = new Intent(activity9.this, activity12.class);
                startActivity(intent);

            } });










    }
}