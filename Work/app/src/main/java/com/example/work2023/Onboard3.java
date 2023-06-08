package com.example.work2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Onboard3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboard3);
    }

    public void onClick(View view){
        Intent mainIntent = new Intent(Onboard3.this,WellCome.class);
        startActivity(mainIntent);
        Onboard3.this.finish();
    }
}