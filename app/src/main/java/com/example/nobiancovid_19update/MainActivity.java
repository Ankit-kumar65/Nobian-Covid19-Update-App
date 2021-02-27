package com.example.nobiancovid_19update;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.util.Constants;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {


    private Button b11;
    private Button b22;
    private Button b33;
    private Button b44;


    public boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b11 = (Button) findViewById(R.id.b1);
        b22 = (Button) findViewById(R.id.b2);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity2();

            }

            private void openactivity2() {
                Intent intent = new Intent(MainActivity.this, activity4.class);
                startActivity(intent);

            }


        });


        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity3();

            }

            private void openactivity3() {
                Intent intent = new Intent(MainActivity.this, activity3.class);
                startActivity(intent);

            }


        });


        Button b33 = (Button) findViewById(R.id.b3);
        b33.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                openactivity6();

            }

            private void openactivity6() {
                Intent intent = new Intent(MainActivity.this, activity6.class);
                startActivity(intent);

            }


        });







        if(!isNetworkAvailable()){
            //Toast.makeText(this, "No Internet Connection", Toast.LENGTH_SHORT).show();
            new AlertDialog.Builder(this)
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .setTitle("Closing the App")
                    .setMessage("No Internet Connection,check your settings")
                    .setPositiveButton("Close", new DialogInterface.OnClickListener()
                    {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }

                    })
                    .show();
        }








    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {

            case R.id.b17:


                finish();

                startActivity(getIntent());
                Toast.makeText(this,"Refresh successful",Toast.LENGTH_SHORT);
                return true;
            case R.id.b124:
                startActivity(new Intent(this, activity18.class));
                return true;

            case R.id.b125:
                startActivity(new Intent(this, activity19.class));
                return true;

            case R.id.b126:
                startActivity(new Intent(this, activity20.class));
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }


    }






}











