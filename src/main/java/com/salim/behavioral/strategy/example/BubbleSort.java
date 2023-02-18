package com.salim.behavioral.strategy.example;

public class BubbleSort implements SortingStrategy{
    @Override
    public void sort(int[] array) {
        System.out.println("Sorting using Bubble sort");
        bubbleSort(array, array.length);
    }

    static void bubbleSort(int[] array, int n) {
        if (n == 1) // passes are done
            return;

        // iteration through unsorted elements
        for (int i=0; i<n-1; i++) {
            //check if the elements are in order
            if (array[i] > array[i+1]) {
                // if not, swap them
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        }

        bubbleSort(array, n-1); // one pass done, proceed to the next
    }
}
