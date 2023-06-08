package com.example.work2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class password extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
    }

    public void onClick(View view){
        Intent mainIntent = new Intent(password.this,CreatePass.class);
        startActivity(mainIntent);
        password.this.finish();
    }
}