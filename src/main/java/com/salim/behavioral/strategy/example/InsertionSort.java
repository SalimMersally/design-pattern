package com.salim.behavioral.strategy.example;

public class InsertionSort implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("Sorting using Insertion sort");
        insertionSort(array, array.length);
    }

    private void insertionSort(int[] array, int n) {
        if (n <= 1)
            return;

        insertionSort(array, n-1); // one element sorted, sort the remaining array

        int last = array[n-1]; // last element of the array
        int j = n-2; // correct index of last element of the array

        // find the correct index of the last element
        while (j >= 0 && array[j] > last) {
            // shift section of sorted elements upwards by one element if correct index isn't found
            array[j+1] = array[j];
            j--;
        }
        array[j+1] = last; // set the last element at its correct index
    }
}
