package com.hz.happyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
//import android.util.Size;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import nl.dionsegijn.konfetti.models.Shape;
import nl.dionsegijn.konfetti.models.Size;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button happyButton = findViewById(R.id.happyButton);
        final TextView happyText = findViewById(R.id.happyText);
        final nl.dionsegijn.konfetti.KonfettiView viewKonfetti = findViewById(R.id.viewKonfetti);

        happyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                happyText.setText(R.string.happyTextClicked);

                viewKonfetti.build()
                        .addColors(Color.YELLOW, Color.GREEN, Color.MAGENTA)
                        .setDirection(0.0, 359.0)
                        .setSpeed(1f, 5f)
                        .setFadeOutEnabled(true)
                        .setTimeToLive(2000L)
                        .addShapes(Shape.RECT, Shape.CIRCLE)
                        .addSizes(new Size(12, 5))
                        .setPosition(-50f, viewKonfetti.getWidth() + 50f, -50f, -50f)
                        .streamFor(300, 5000L);
            }
        });
    }
}
