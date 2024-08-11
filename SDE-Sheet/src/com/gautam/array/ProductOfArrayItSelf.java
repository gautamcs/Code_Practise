package com.gautam.array;

import java.util.Arrays;

public class ProductOfArrayItSelf {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

        int prod = 1;
       for(int i = 0; i < arr.length; i++) {
           prod = prod * arr[i];
       }

       int[] temp = new int[arr.length];
       for(int i = 0; i < arr.length; i++) {
           temp[i] = prod / arr[i];
       }

        System.out.println(" Original Array: "+Arrays.toString(arr));
        System.out.println(" Result Array: "+Arrays.toString(temp));
    }
}
