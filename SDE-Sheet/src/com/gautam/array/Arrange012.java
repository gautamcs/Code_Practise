package com.gautam.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrange012 {
    public static void main(String[] args) {

        int[] arr = {1,2,0,2,1,0,0,1,1,2};

        System.out.println(" Original Array: "+Arrays.toString(arr));

       // Arrays.sort(arr);

        System.out.println(" Sorted Array: "+Arrays.toString(arr));

        int[] arr1= {0,0,1,1,1,2,2,3,3,4};

        List<Integer> list = new ArrayList<>();
        for(int i : arr1) {
            list.add(i);
        }

        int[] array = Arrays.stream(arr1).distinct().toArray();
        System.out.println(list);

        //List<Integer> temp = list.stream().distinct().collect(Collectors.toList());

        char[] newArr = new char[arr1.length];
        for(int i = 0; i < arr1.length; i++) {
            if(array.length > i) {
                newArr[i] = (char)array[i];
            } else {
                newArr[i] = '_';
            }

        }

        System.out.println(" Final Array: "+Arrays.toString(newArr));
        System.out.println(" Diff: "+(arr1.length - array.length));

    }
}
