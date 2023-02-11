package com.salim.structural.decorator.example;

// Base component should provide default implementation
public class PlainPizza implements Pizza {

    // Where using here a default construct
    @Override
    public String makePizza() {
        return "Making a pizza";
    }

    @Override
    public double getCost() {
        return 1;
    }
}
