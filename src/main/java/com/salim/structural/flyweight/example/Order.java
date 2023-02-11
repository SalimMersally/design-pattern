package com.salim.structural.flyweight.example;

public class Order {
    private final FoodItem foodItem;
    private final int quantity;

    // The food item here will be shared
    // we will get the food item from the factory
    public Order(FoodItem foodItem, int quantity) {
        this.foodItem = foodItem;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return foodItem.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return "Order:" +
                "\n\tfoodItem: " + foodItem +
                "\n\tquantity: " + quantity +
                "\n\tTotal Price: " + getTotalPrice();
    }
}
