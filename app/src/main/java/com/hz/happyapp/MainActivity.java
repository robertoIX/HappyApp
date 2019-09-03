package com.hz.happyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView textview;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview = (TextView) findViewById(R.id.worksText);
        button = (Button) findViewById(R.id.partyButton);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.dansplaat);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp.start();
                textview.setText(R.string.happyTextClicked);
            }
        });
    }
}
