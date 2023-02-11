package com.salim.structural.decorator.example;

// Concrete decorator extends the default one
// it overrides the default functionality and change it
public class TomatoSauceDecorator extends PizzaDecorator{
    public TomatoSauceDecorator(Pizza baseObject) {
        super(baseObject);
    }

    @Override
    public String makePizza() {
        return baseObject.makePizza() + ", with tomato sauce";
    }

    @Override
    public double getCost() {
        return baseObject.getCost() + 0.1;
    }
}
