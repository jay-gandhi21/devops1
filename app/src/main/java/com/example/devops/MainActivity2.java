package com.example.devops;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    RelativeLayout relativeLayout;
    Button btn_vibrate,btn_colour;
    Vibrator vibrator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn_vibrate= findViewById(R.id.btn_vibrate);
        vibrator= (Vibrator)getSystemService(VIBRATOR_SERVICE);
        btn_colour=findViewById(R.id.btn_colour);
        relativeLayout=findViewById(R.id.relativelayout);

        btn_vibrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibrator.vibrate(1000);
            }
        });
        btn_colour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random=new Random();

                int color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
                relativeLayout.setBackgroundColor(color);
            }
        });
    }
}