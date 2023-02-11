package com.salim.structural.flyweight;

import java.util.HashMap;

public class FoodItemFactory {
    private static final HashMap<String, FoodItem> foodItems = new HashMap<>();

    public static FoodItem getFoodItem(String name, double price) {
        if (!foodItems.containsKey(name)) {
            foodItems.put(name, new FoodItem(name, price));
        }
        return foodItems.get(name);
    }
}
