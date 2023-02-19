package com.salim.behavioral.iterator.example;

public class ConcreteAggregate implements Aggregate {
    private Object[] items;

    public ConcreteAggregate(Object[] items) {
        this.items = items;
    }

    public Iterator createIterator() {
        return new ConcreteIterator(items);
    }
}