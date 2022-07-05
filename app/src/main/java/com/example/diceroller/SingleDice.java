package com.example.diceroller;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class SingleDice extends AppCompatActivity {

    public static final Random RANDOM = new Random();
    private Button rollDices;
    private ImageView imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singledice);
        rollDices = (Button) findViewById(R.id.rollDices);
        imageView1 = (ImageView) findViewById(R.id.imageView1);

        rollDices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int randomNumber = RANDOM.nextInt(6) + 1;

                switch (randomNumber) {
                    case 1:
                        imageView1.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        imageView1.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        imageView1.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        imageView1.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        imageView1.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        imageView1.setImageResource(R.drawable.dice6);
                        break;

                }
            }
        });
    }
}