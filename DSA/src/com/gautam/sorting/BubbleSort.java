package com.gautam.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,9,1,4,3,2,4,8,7};
        System.out.println(" Original Array: "+ Arrays.toString(arr));
        int len = arr.length;

        for(int i = 0; i < len; i++) {
            int flag = 0;
            for(int j = 0; j < len -1-i; j++) {

                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0) {
                break;
            }
        }
        System.out.println(" Sorted Array: "+ Arrays.toString(arr));
    }
}
