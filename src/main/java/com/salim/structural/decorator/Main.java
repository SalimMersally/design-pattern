package com.salim.structural.decorator;

import com.salim.structural.decorator.example.PepperoniDecorator;
import com.salim.structural.decorator.example.Pizza;
import com.salim.structural.decorator.example.PlainPizza;
import com.salim.structural.decorator.example.TomatoSauceDecorator;

public class Main {

    public static void main(String[] args) {
        // making a plain pizza
        Pizza plainPizza = new PlainPizza();
        System.out.println(plainPizza.makePizza());
        System.out.println("Price: " + plainPizza.getCost());

        // making a pizza with tomato sauce
        Pizza basePizzaWithTomatoSauce = new TomatoSauceDecorator(new PlainPizza());
        System.out.println(basePizzaWithTomatoSauce.makePizza());
        System.out.println("Price: " +  basePizzaWithTomatoSauce.getCost());

        // making a pizza with tomato sauce and pepperoni\
        Pizza pizzaAllTopping = new PepperoniDecorator(new TomatoSauceDecorator(new PlainPizza()));
        System.out.println(pizzaAllTopping.makePizza());
        System.out.println("Price: " + pizzaAllTopping.getCost());
    }

}
