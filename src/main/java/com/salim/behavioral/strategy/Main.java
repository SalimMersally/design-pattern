package com.salim.behavioral.strategy;

import com.salim.behavioral.strategy.example.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SortingContext context = new SortingContext(new BubbleSort());
        int[] array;

        array = getRandomArray();
        displayArray(array);
        context.sortArray(array);
        displayArray(array);

        array = getRandomArray();
        context.setStrategy(new InsertionSort());
        displayArray(array);
        context.sortArray(array);
        displayArray(array);

        array = getRandomArray();
        context.setStrategy(new SelectionSort());
        displayArray(array);
        context.sortArray(array);
        displayArray(array);

        array = getRandomArray();
        context.setStrategy(new MergeSort());
        displayArray(array);
        context.sortArray(array);
        displayArray(array);
    }

    private static int[] getRandomArray() {
        int[] array = new int[10];
        Random rand = new Random();

        for(int i=0; i<10; i++)
            array[i] = rand.nextInt(100);

        return array;
    }

    public static void displayArray(int[] array) {
        for(int element: array)
            System.out.print(element + ", ");
        System.out.println();
    }
}
