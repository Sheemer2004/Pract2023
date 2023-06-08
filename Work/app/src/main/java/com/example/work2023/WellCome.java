package com.example.work2023;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WellCome extends AppCompatActivity {

    public class SimpleEMail extends Activity{
        Button send;
        EditText address;
        String emailtext;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_well_come);
        getSupportActionBar().hide();

        send = (Button) findViewById(R.id.BTok);
        address = (EditText) findViewById(R.id.address);
        emailtext = (String) "1111";

        send.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){
               final Intent emailIntent = new Intent(Intent.ACTION_SEND);
               emailIntent.setType("plain/text");

               emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{addres.getText().toString()});

               emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, emaittext);

               SimpleEMail.this.startActivity(Intent.createChooser(emailIntent, "Отправка письма ..."));
           }
        });
    }

    public static boolean isValidEmail(String email){
        String emailPattern = "^[a-z0-9]+@[a-z]+\\.+[a-z]+";
        return email.matches(emailPattern);
    }

    public void onClick(View view){
        Intent mainIntent = new Intent(WellCome.this,password.class);
        startActivity(mainIntent);
        WellCome.this.finish();
    }
}