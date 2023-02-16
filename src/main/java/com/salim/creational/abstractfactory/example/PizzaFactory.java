package com.salim.creational.abstractfactory.example;

public class PizzaFactory implements FoodFactory {
    @Override
    public Food createFood() {
        return new Pizza();
    }
}