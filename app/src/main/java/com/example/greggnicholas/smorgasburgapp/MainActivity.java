package com.example.greggnicholas.smorgasburgapp;

import android.app.NotificationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.greggnicholas.smorgasburgapp.Model.Food;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String CHANNEL_ID = "notification_chanel";
    public static NotificationManager notificationManager;
    private static final int NOTIFICATION_ID = 0;
    private static final String NOTIFICATION_TOAST = "";
    List<Food> food1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        food1 = new ArrayList<>();
        food1.add(new Food("Beer", R.drawable.beer, "Ale"));
        food1.add(new Food("Pulled Pork & Dumplings", R.drawable.pulledporkwithdumplings, "Pulled pork with dumplings"));
        food1.add(new Food("Sushi Tacos", R.drawable.sushitacos, "Sushi Tacos"));
        food1.add(new Food("Bear Ice Cream", R.drawable.bear_ice_cream, "bear ice cream"));
        food1.add(new Food("Mahalo Poke bowl", R.drawable.mahalo_poke_bowl, "Pokebowl"));
        food1.add(new Food("Pulled Pork Melt Sandwich", R.drawable.pulled_pork_melt, "melt"));
        food1.add(new Food("Melted Cheese Sandwiches", R.drawable.metled_chesse_sandwich, "sandwich"));
        food1.add(new Food("Fresh Mussels", R.drawable.fresh_mussels, "fresh mussels"));
        food1.add(new Food("Spicy Chicken Burger", R.drawable.spicy_chicken, "spicychicken"));
        food1.add(new Food("Wowfulls Ice Cream", R.drawable.wowfulls_ice_cream, "fwef"));
        food1.add(new Food("Bacon Lobster Rolls", R.drawable.lobster_bacon_roll, "esg"));
        food1.add(new Food("Spicy Ramen", R.drawable.spicy_ramen, "Chocolate platter has to have a yellow, bloody garlic component."));
        food1.add(new Food("French Fries", R.drawable.french_fries, "Sauté springy blood orangess in a pan with peppermint tea for about an hour to perfect their saltyness."));
        food1.add(new Food("Mozzarella Sticks", R.drawable.mozzarella_sticks, "Try grilling chocolate chili rinseed with maple syrup."));
        food1.add(new Food("Dumplings", R.drawable.dumplings, "With garlics drink beer."));
        food1.add(new Food("Pizza Cupcakes", R.drawable.pizza_cupcakes, "Smashed, fresh pudding is best enamelled with shredded water."));
        food1.add(new Food("Shrimp Bun", R.drawable.shrimp_bun, "Smashed, divided pudding is best seasoned with muddy fish sauce."));
        food1.add(new Food("Chutto", R.drawable.churro, "Break eleven chicories, garlic, and chipotle chile powder in a large cooker over medium heat, cook for six minutes and mash up with some lobster."));
        food1.add(new Food("BBQ Jackfruit", R.drawable.bbq_jackfruit, "Sauté canned quinoas in a fine-mesh strainer with plain vinegar for about an hour to increase their consistency."));
        food1.add(new Food("Afghan Comfort Food", R.drawable.afghan_comfort_food, "Everyone loves the sweetness of rhubarb ricotta flavord with heated oregano."));


        RecyclerView recyclerView = findViewById(R.id.recyclerview_Smorgasburg);
        FoodcyclerAdapter foodcyclerAdapter = new FoodcyclerAdapter(this, food1);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(foodcyclerAdapter);

    }
}
