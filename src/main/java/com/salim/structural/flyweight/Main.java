package com.salim.structural.flyweight;

import com.salim.structural.flyweight.example.FoodItem;
import com.salim.structural.flyweight.example.FoodItemFactory;
import com.salim.structural.flyweight.example.Order;

public class Main {
    public static void main(String[] args) {
        FoodItem foodItem1 = FoodItemFactory.getFoodItem("Pizza", 3.5);
        Order order1 = new Order(foodItem1, 3);

        FoodItem foodItem2 = FoodItemFactory.getFoodItem("Pizza", 3.5);
        Order order2 = new Order(foodItem2, 1);

        System.out.println(order1);
        System.out.println(order2);

        System.out.println("foodItem1 == foodItem2: " + (foodItem1 == foodItem2));
    }
}
