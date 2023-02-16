package com.salim.creational.abstractfactory.example;

import com.salim.creational.abstractfactory.example.Food;
import com.salim.creational.abstractfactory.example.FoodFactory;

public class Restaurant {
    private Food food;

    public Restaurant(FoodFactory factory) {
        food = factory.createFood();
    }

    public void prepareFood() {
        food.prepare();
    }
}