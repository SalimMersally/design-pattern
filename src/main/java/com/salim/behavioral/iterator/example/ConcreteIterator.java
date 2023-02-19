package com.salim.behavioral.iterator.example;

public class ConcreteIterator implements Iterator {
    private Object[] items;
    private int position = 0;

    public ConcreteIterator(Object[] items) {
        this.items = items;
    }

    public boolean hasNext() {
        return position < items.length;
    }

    public Object next() {
        Object item = items[position];
        position++;
        return item;
    }
}