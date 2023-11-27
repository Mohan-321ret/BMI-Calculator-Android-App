package com.example.bmicalculator;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.airbnb.lottie.LottieAnimationView;

public class SplashActivity extends AppCompatActivity {


    LottieAnimationView splashanimationimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        splashanimationimg = findViewById(R.id.splashanimationimg);
        getWindow().setStatusBarColor(ContextCompat.getColor(SplashActivity.this, android.R.color.holo_orange_light));
        getSupportActionBar().hide();




        splashanimationimg.animate().translationY(0).setDuration(2000).setStartDelay(2900);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this,MainActivity.class));
            }
        },4000);
    }
}