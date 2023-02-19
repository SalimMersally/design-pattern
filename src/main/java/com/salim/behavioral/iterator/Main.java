package com.salim.behavioral.iterator;

import com.salim.behavioral.iterator.example.Aggregate;
import com.salim.behavioral.iterator.example.ConcreteAggregate;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Object[] items = {"Apple", "Banana", "Cherry"};
        Aggregate aggregate = new ConcreteAggregate(items);
        Iterator iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            Object item = iterator.next();
            System.out.println(item);
        }
    }
}
/*
Aggregate is an interface that defines the method createIterator(), which creates an iterator object for the collection.
 ConcreteAggregate is a concrete implementation of Aggregate that creates an array of objects and returns a
 ConcreteIterator object.

Iterator is an interface that defines the methods hasNext() and next(), which are used to traverse the collection.
ConcreteIterator is a concrete implementation of Iterator that uses an array of objects to keep track of the position
in the collection.

Finally, Client is a class that uses ConcreteAggregate and ConcreteIterator to traverse the collection of objects and
print them to the console.

Note that this is just one example implementation of the Iterator pattern, and there are many variations depending on
the specific use case.
*/