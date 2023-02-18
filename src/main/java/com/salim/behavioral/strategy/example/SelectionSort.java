package com.salim.behavioral.strategy.example;

public class SelectionSort implements SortingStrategy{
    @Override
    public void sort(int[] array) {
        System.out.println("Sorting using Selection sort");
        selectionSort(array);
    }

    private void selectionSort(int[] array) {
        int pos;
        int temp;
        for (int i = 0; i < array.length; i++) {
            pos = i;
            for (int j = i+1; j < array.length; j++)
                if (array[j] < array[pos]) // find the index of the minimum element
                    pos = j;

            temp = array[pos]; // swap the current element with the minimum element
            array[pos] = array[i];
            array[i] = temp;
        }
    }
}
