package com.salim.creational.builder;

import com.salim.creational.builder.example.Product;
import com.salim.creational.builder.example.ProductBuilder;

public class Main {
    public static void main(String[] args) {
        Product product = new ProductBuilder()
                .setName("Shirt")
                .setSize(42)
                .setColor("Blue")
                .setPrice(12.4)
                .setCategory("Cloth")
                .setDateOfProduction("10-4-2015")
                .build();

        System.out.println(product);
    }
}
/*
We have a Product class that has a constructor with three parameters: name, size, and color. We also have a
ProductBuilder class that has three methods for setting the name, size, and color of the product. Finally,
we have a build method in the ProductBuilder class that creates a new Product object with the values set by the builder.

In the Main class, we create a new Product object using the ProductBuilder by setting the product's name, size, and
color using the builder's methods. Finally, we call the build method to create the Product object and print it to the
console using the toString method.
*/