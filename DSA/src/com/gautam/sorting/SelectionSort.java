package com.gautam.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {2,9,1,4,3,2,4,8,7};

        System.out.println(" Original Array: "+ Arrays.toString(arr));
        int len = arr.length;
        for(int i = 0; i < len-1; i++) {
            int min = i;
            for(int j = i+1; j <= len-1; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
                if(i != min) {
                    int temp = arr[i];
                    arr[i] = arr[min];
                    arr[min] = temp;
                }
            }
        }
        System.out.println(" Sorted Array: "+Arrays.toString(arr));
    }
}

/*
 for(int i = 0; i < len-1; i++) {

            for(int j = 0; j < len - i-1; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
 */