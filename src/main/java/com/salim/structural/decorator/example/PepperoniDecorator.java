package com.salim.structural.decorator.example;

// Concrete decorator extends the default one
// it overrides the default functionality and change it
public class PepperoniDecorator extends PizzaDecorator{
    public PepperoniDecorator(Pizza baseObject) {
        super(baseObject);
    }

    @Override
    public String makePizza() {
        return baseObject.makePizza() + ", with pepperoni";
    }

    @Override
    public double getCost() {
        return  baseObject.getCost() + 0.2;
    }
}
