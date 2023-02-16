package com.salim.structural.composite.example;

import java.util.ArrayList;
import java.util.List;

public class FoodCombo implements Food{
    private final List<Food> foodList;

    public FoodCombo() {
        foodList = new ArrayList<>();
    }

    public void addFood(Food food){
        foodList.add(food);
    }

    @Override
    public void prepare() {
        for(Food food: foodList){
            food.prepare();
        }
    }

    @Override
    public double getPrice() {
        double totalPrice = 0;
        for(Food food: foodList)
            totalPrice+= food.getPrice();
        return totalPrice;
    }
}
