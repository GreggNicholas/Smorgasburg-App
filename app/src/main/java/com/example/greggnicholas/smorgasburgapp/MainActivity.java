package com.example.greggnicholas.smorgasburgapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.greggnicholas.smorgasburgapp.Model.Food;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Food> food1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        food1 = new ArrayList<>();
//          food1.add(new Food("Beer",R.drawable.beer));
//        food1.add(new Food("Pulled Pork & Dumplings",R.drawable.pulledporkwithdumplings));
//        food1.add(new Food("Sushi Tacos",R.drawable.sushitacos));
//        food1.add(new Food("Bear Ice Cream",R.drawable.bear_ice_cream));
//        food1.add(new Food("Mahalo Poke bowl",R.drawable.mahalo_poke_bowl));
//        food1.add(new Food("Pulled Pork Melt Sandwich",R.drawable.pulled_pork_melt));
//        food1.add(new Food("Melted Cheese Sandwiches",R.drawable.melted_cheese_sandwich));
//        food1.add(new Food("Fresh Mussels",R.drawable.fresh_mussels));
//        food1.add(new Food("Spicy Chicken Burger",R.drawable.spicychicken));
//        food1.add(new Food("Wowfulls Ice Cream",R.drawable.wowfulls_ice_cream));
//        food1.add(new Food("Bacon Lobster Rolls",R.drawable.lobster_bacon_roll));
//        food1.add(new Food("Spicy Ramen",R.drawable.spicy_ramen));
//        food1.add(new Food("French Fries",R.drawable.french_fries));
//        food1.add(new Food("Mozzarella Sticks",R.drawable.mozzarella_sticks));
//        food1.add(new Food("Dumplings",R.drawable.dumplings));
//        food1.add(new Food("Pizza Cupcakes",R.drawable.pizza_cupcakes));
//        food1.add(new Food("Shrimp Bun",R.drawable.shrimp_bun));
//        food1.add(new Food("BBQ Jackfruit",R.drawable.bbq_jackfruit));
//        food1.add(new Food("Afghan Comfort Food",R.drawable.afghan_comfort_food));
//        food1.add(new Food("Beer",R.drawable.beer));

        RecyclerView recyclerView = findViewById(R.id.recyclerview_Smorgasburg);
        FoodcyclerAdapter foodcyclerAdapter = new FoodcyclerAdapter(this, food1);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(foodcyclerAdapter);

    }
}
