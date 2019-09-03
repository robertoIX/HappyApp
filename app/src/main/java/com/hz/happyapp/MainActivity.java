package com.hz.happyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton2Tap(View v) {
        Toast myToast = Toast.makeText(
                getApplicationContext(),
                "You are a beautiful person!",
                Toast.LENGTH_SHORT);
        myToast.show();
    }

    }

