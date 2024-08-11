package com.gautam.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void divide(int[] arr, int s, int e) {
        while (s >= e)
            return;
        int mid = s + (e - s) / 2;
        divide(arr, s, mid);
        divide(arr, mid + 1, e);
        conquer(arr, s, mid, e);
    }

    private static void conquer(int[] arr, int s, int mid, int e) {
        int[] temp = new int[e - s + 1];

        int i = s;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= e) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= e) {
            temp[k++] = arr[j++];
        }

       // Copies the temp array data to the original array
        for (int a = 0, b = s; a < temp.length; a++, b++) {
            arr[b] = temp[a];
        }
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 1, 4, 3};

        System.out.println(" Original Array: " + Arrays.toString(arr));
        int len = arr.length;

        MergeSort.divide(arr, 0, len - 1);
        System.out.println(" Sorted Array: " + Arrays.toString(arr));
    }
}
