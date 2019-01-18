package com.example.greggnicholas.smorgasburgapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.greggnicholas.smorgasburgapp.Model.Food;

import java.util.List;

public class FoodcyclerAdapter extends RecyclerView.Adapter<FoodcyclerAdapter.MyViewHolder> {
    private Context context;
    private List<Food> foodList;


    public FoodcyclerAdapter(Context context, List<Food> foodList) {
        this.context = context;
        this.foodList = foodList;
    }


    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int position) {
        View childView;
        LayoutInflater inflater = LayoutInflater.from(context);
        childView = inflater.inflate(R.layout.cardview_layout, parent, false);
        return new MyViewHolder(childView);
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, final int position) {

        myViewHolder.thumbNailView.setImageResource(foodList.get(position).getThumbNail());
        myViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, GrubInfo.class);
                intent.putExtra("Food Name", foodList.get(position).getFoodName());
                intent.putExtra("Food Picture", foodList.get(position).getThumbNail());
                intent.putExtra("Food Description", foodList.get(position).getFoodName());



                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView foodName;
        ImageView thumbNailView;
        CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            foodName = itemView.findViewById(R.id.food_name);
            thumbNailView = itemView.findViewById(R.id.image_view_cardview);
            cardView = itemView.findViewById(R.id.card_view_layout);
        }
    }
}
