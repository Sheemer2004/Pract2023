package com.example.work2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Onboard1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboard1);
    }
    public void onClick(View view){
        Intent mainIntent = new Intent(Onboard1.this,Onboard2.class);
        startActivity(mainIntent);
        Onboard1.this.finish();
    }
}