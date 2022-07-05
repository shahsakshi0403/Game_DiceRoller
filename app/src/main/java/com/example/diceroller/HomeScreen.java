package com.example.diceroller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeScreen extends AppCompatActivity{

    Button singledice,dualdice;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homescreen);

        singledice=(Button) findViewById(R.id.singledice);
        dualdice=(Button) findViewById(R.id.dualdice);

        singledice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext() ,SingleDice.class);
                startActivity(i);

            }
        });

        dualdice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext() ,DualDice.class);
                startActivity(i);
            }
        });
    }
}
