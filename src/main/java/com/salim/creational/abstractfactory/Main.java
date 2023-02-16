package com.salim.creational.abstractfactory;

import com.salim.creational.abstractfactory.example.BurgerFactory;
import com.salim.creational.abstractfactory.example.PizzaFactory;
import com.salim.creational.abstractfactory.example.Restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant burgerRestaurant = new Restaurant(new BurgerFactory());
        burgerRestaurant.prepareFood();

        Restaurant pizzaRestaurant = new Restaurant(new PizzaFactory());
        pizzaRestaurant.prepareFood();
    }
}
/*We have an interface Food with a method prepare() and two concrete implementations, Burger and Pizza.
The FoodFactory interface has a method createFood() that returns an instance of Food.
The BurgerFactory and PizzaFactory classes implement the FoodFactory interface, and return instances of the corresponding
concrete food implementations.
The Restaurant class is the client, it uses the factory to create a food item and then calls the prepare() method to prepare the food
.*/
/*In this example, you can see how "the Abstract Factory pattern" abstracts the creation of food items, making it easy
to switch between different food implementations without affecting the client code.*/