package com.gautam.array;

import java.util.Arrays;

public class MaxMinValue {
    public static void main(String[] args) {
        int[] arr = {2,9,4,8,3,1,7,6,5,0,-1};
        System.out.println(" Original Array: "+ Arrays.toString(arr));
        int max = 0;
        int min = 0;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[max]) {
                max = i;
            } else
                min = i;
        }

        System.out.println(" Max Element: "+arr[max]);
        System.out.println(" Min Element: "+arr[min]);

    }
}
