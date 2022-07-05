package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView iv1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv1=(ImageView) findViewById(R.id.imgDice);
        iv1.setImageResource(R.drawable.splash);

        Handler h=new Handler();
        h.postDelayed(() -> {
            Intent i =new Intent(MainActivity.this,HomeScreen.class);
            startActivity(i);
            finish();
        }, 2000);
    }
}