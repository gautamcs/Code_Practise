package com.gautam.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        //int[] arr = {7,6,1,3,2,5,9,7,0};
        int[] arr = {5, 1, 3, 2, 4};

        System.out.println(" Original Data: " + Arrays.toString(arr));

        // Insertion Sort
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int key = arr[i];

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        System.out.println(" Sorted Data: " + Arrays.toString(arr));
    }
}
