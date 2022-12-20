package com.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(SplashActivity.this, "당근에 오신걸 환영합니다", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                ActivityCompat.finishAffinity(SplashActivity.this);

            }
        }, 1000 * 2);

    }
}