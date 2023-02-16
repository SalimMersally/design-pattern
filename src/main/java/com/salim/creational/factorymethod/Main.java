package com.salim.creational.factorymethod;

import com.salim.creational.factorymethod.example.ConcreteCreatorA;
import com.salim.creational.factorymethod.example.ConcreteCreatorB;
import com.salim.creational.factorymethod.example.Creator;

public class Main {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        creatorA.doSomething();

        Creator creatorB = new ConcreteCreatorB();
        creatorB.doSomething();
    }
}

/*The Product interface defines the operations that the concrete products should implement.
The ConcreteProductA and ConcreteProductB classes are two different implementations of the Product interface.

The Creator class is an abstract class that defines the factory method factoryMethod(), which returns a Product object.
The doSomething() method uses the factoryMethod() to create a Product object and then calls its operation() method.

The ConcreteCreatorA and ConcreteCreatorB classes are concrete implementations of the Creator class.
They provide their own implementation of the factoryMethod() to create either ConcreteProductA or ConcreteProductB objects.

Finally, the Main class uses the ConcreteCreatorA and ConcreteCreatorB objects to create Product objects and call
their operation() method.
*/