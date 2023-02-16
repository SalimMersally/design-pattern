package com.salim.structural.composite;

import com.salim.structural.composite.example.Burger;
import com.salim.structural.composite.example.Food;
import com.salim.structural.composite.example.FoodCombo;
import com.salim.structural.composite.example.Pizza;

public class Main {
    public static void main(String[] args) {
        Food pizza1 = new Pizza();
        Food pizza2 = new Pizza();

        Food burger= new Burger();

        FoodCombo combo = new FoodCombo();
        combo.addFood(pizza1);
        combo.addFood(pizza2);
        combo.addFood(burger);

        combo.prepare();
        System.out.println("Total Price: $"+ combo.getPrice());

    }
}
