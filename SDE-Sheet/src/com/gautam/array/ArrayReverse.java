package com.gautam.array;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};

        System.out.println(" Original Array: "+Arrays.toString(arr));
        int len = arr.length;
        for(int i = 0, j = len-1; i <= j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println(" Modified Array: "+Arrays.toString(arr));
    }
}
