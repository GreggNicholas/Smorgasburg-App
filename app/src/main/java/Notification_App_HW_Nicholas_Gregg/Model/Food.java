package Notification_App_HW_Nicholas_Gregg.Model;

import android.support.annotation.NonNull;

public class Food {

    private String foodName;

    public String getDescription() {
        return description;
    }

    private String description;
    private int thumbNail;

    @NonNull
    public String getFoodName() {
        return foodName;
    }


    @NonNull
    public int getThumbNail() {
        return thumbNail;
    }

    public Food(@NonNull String foodName, int thumbNail, String description) {
        this.foodName = foodName;
        this.thumbNail = thumbNail;
        this.description = description;
    }
}
