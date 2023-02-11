package com.salim.structural.decorator.example;

// The base decorator should implement the same interface
// it should also add a field of the base object
abstract public class PizzaDecorator implements Pizza {
    protected final Pizza baseObject;

    // The decorator should include a constructor to initialize the base object
    public PizzaDecorator(Pizza baseObject) {
        this.baseObject = baseObject;
    }

    // The method of the base decorator should simply call the default methods
    // Other functionality can be added in the decorator implementation
    @Override
    public String makePizza() {
        return baseObject.makePizza();
    }

    @Override
    public double getCost() {
        return baseObject.getCost();
    }
}
