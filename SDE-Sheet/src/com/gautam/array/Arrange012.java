package com.gautam.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrange012 {
    public static void main(String[] args) {

        int[] arr = {1,2,0,2,1,0,0,1,1,2};

        System.out.println(" Original Array: "+Arrays.toString(arr));

        int lo = 0;
        int mid = 0;
        int hi = arr.length-1;
        int temp = 0;

        while (mid <= hi) {
            switch (arr[mid]) {
                case 0: {
                    temp = arr[lo];
                    arr[lo] = arr[mid];
                    arr[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    temp = arr[mid];
                    arr[mid] = arr[hi];
                    arr[hi] = temp;
                    hi--;
                    break;
                }
            }
        }
        System.out.println(" Final Array: "+Arrays.toString(arr));
    }
}
