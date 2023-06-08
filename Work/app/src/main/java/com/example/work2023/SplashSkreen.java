package com.example.work2023;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


import java.util.logging.LogRecord;

public class SplashSkreen extends Activity {

    private final int Splash_Display = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_skreen);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){
                Intent mainIntent = new Intent(SplashSkreen.this,Onboard1.class);
                startActivity(mainIntent);
                SplashSkreen.this.finish();

            }
        },Splash_Display);
    }
    @Override
    public  void onBackPressed(){
        super.onBackPressed();
    }
}