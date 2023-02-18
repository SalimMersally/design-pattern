package com.salim.behavioral.strategy.example;

public class MergeSort implements SortingStrategy {

    @Override
    public void sort(int[] array) {
        System.out.println("Sorting using Merge sort");
        mergeSort(array, 0, array.length - 1);
    }

    private void mergeSort(int[] array, int left, int right) {
        int middle;
        if (left < right) {
            middle = (left + right) / 2;

            mergeSort(array, left, middle); // sort left sub-array
            mergeSort(array, middle + 1, right); // sort right sub-array

            merge(array, left, middle, right); // merge the two sub-arrays
        }
    }

    private void merge(int[] array, int left, int middle, int right) {
        int low = middle - left + 1; //size of the left subarray
        int high = right - middle; //size of the right subarray

        //create the left and right subarray
        int[] L = new int[low];
        int[] R = new int[high];

        int i, j;
        //copy elements into left subarray
        for (i = 0; i < low; i++)
            L[i] = array[left + i];
        //copy elements into right subarray
        for (j = 0; j < high; j++)
            R[j] = array[middle + 1 + j];

        int k = left; //get starting index for sort
        i = 0; // reset loop variables before performing merge
        j = 0;

        // merge the left and right sub-arrays
        while (i < low && j < high) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        // merge the remaining elements from the left subarray
        while (i < low) {
            array[k] = L[i];
            i++;
            k++;
        }

        //merge the remaining elements from right subarray
        while (j < high) {
            array[k] = R[j];
            j++;
            k++;
        }
    }
}
