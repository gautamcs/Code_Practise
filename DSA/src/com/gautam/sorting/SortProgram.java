package com.gautam.sorting;

import java.util.Arrays;

public class SortProgram {
    public static void insertionSort(int[] arr, int len) {
        System.out.println(" Sorting using Insertion Sort Algorithm... ");
        for(int i = 1; i < len; i++) {
            int j = i-1;
            int key  = arr[i];

            while(j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.println(" Sorted Array:"+Arrays.toString(arr));
        //return arr;
    }

    public static void selectionSort(int[] arr, int len) {
        System.out.println(" Sorting using Selection Sort Algorithm... ");
        for(int i = 0; i < len; i++) {
            int min = i;

            for(int j = i; j < len ; j++) {
                if(arr[j] < arr[min])
                    min = j;
            }
            if(min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        System.out.println(" Sorted Array:"+Arrays.toString(arr));
    }
    public static void main(String[] args) {

        int[] arr = {2,9,1,4,3,2,4,8,7};
        System.out.println(" Original Array: "+ Arrays.toString(arr));
        int len = arr.length;
        //SortProgram.insertionSort(arr, len);
        SortProgram.selectionSort(arr, len);

    }
}
