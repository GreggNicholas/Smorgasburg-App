package com.example.greggnicholas.smorgasburgapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class GrubInfo extends AppCompatActivity {

    private TextView foodNameView;
    private ImageView foodImageView;
    private TextView foodDescriptionView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Intent intent;
        String foodName;
        String foodDescription;
        int foodImage;


        getSupportActionBar().setTitle("Main Page");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grubinfo);
        foodNameView = findViewById(R.id.food_name);
        foodImageView = findViewById(R.id.foodimage_Grubinfo);
        foodDescriptionView = findViewById(R.id.food_description);


        intent = getIntent();
        foodName = intent.getStringExtra("Food Name");
        foodDescription = intent.getStringExtra("Food Description");
        foodImage = intent.getExtras().getInt("Food Picture");

        foodNameView.setText(foodName);
        foodDescriptionView.setText(foodDescription);
        foodImageView.setImageResource(foodImage);


    }
}
