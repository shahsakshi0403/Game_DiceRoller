package com.example.diceroller;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class DualDice extends AppCompatActivity {

    public static final Random RANDOM = new Random();
    private Button rollDices;
    private ImageView imageView1, imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dualdice);
        rollDices = (Button) findViewById(R.id.rollDices);
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);

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
                int randomNumber1 = RANDOM.nextInt(6) + 1;
                    switch (randomNumber1) {
                        case 1:
                            imageView2.setImageResource(R.drawable.dice1);
                            break;
                        case 2:
                            imageView2.setImageResource(R.drawable.dice2);
                            break;
                        case 3:
                            imageView2.setImageResource(R.drawable.dice3);
                            break;
                        case 4:
                            imageView2.setImageResource(R.drawable.dice4);
                            break;
                        case 5:
                            imageView2.setImageResource(R.drawable.dice5);
                            break;
                        case 6:
                            imageView2.setImageResource(R.drawable.dice6);
                            break;
                    }
            }
        });
    }
}