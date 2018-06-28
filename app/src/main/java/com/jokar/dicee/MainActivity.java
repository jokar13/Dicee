package com.jokar.dicee;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        final ImageView leftImage;
        final ImageView rightImage;


        rollButton = findViewById(R.id.rollButton);
        leftImage = findViewById(R.id.image_leftDice);
        rightImage = findViewById(R.id.image_rightDice);

// TODO : create array to hold image files
        final int[] diceArray = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

// TODO : Button function
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//TODO : Create RandomNumber and programming for leftdice.
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(6);
                leftImage.setImageResource(diceArray[number]);

//TODO : programming for Rightdice.
                number = randomNumberGenerator.nextInt(6);
                rightImage.setImageResource(diceArray[number]);
            }
        });
    }
}
