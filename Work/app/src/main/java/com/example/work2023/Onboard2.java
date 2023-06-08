package com.example.work2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Onboard2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboard2);
    }

    public void onClick(View view){
        Intent mainIntent = new Intent(Onboard2.this,Onboard3.class);
        startActivity(mainIntent);
        Onboard2.this.finish();
    }
}