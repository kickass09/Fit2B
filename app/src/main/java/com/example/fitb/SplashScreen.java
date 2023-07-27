package com.example.fitb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class SplashScreen extends AppCompatActivity {

    TextView appname;
    LottieAnimationView lottie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        appname=findViewById(R.id.appname);
        lottie=findViewById(R.id.lottie);

        appname.animate().translationY(-1600).setDuration(1900).setStartDelay(0);
        lottie.animate().translationX(2000).setDuration(2000).setStartDelay(3100);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(),Login.class);
                startActivity(intent);
                //finish();
            }
        },5000);
    }
}