package com.gautam.array;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

     //  List<Integer> list  = Arrays.stream(arr).distinct().collect(Collectors.toList());

        int i = 0;

        for (final int num : nums)
            if (i < 1 || num > nums[i - 1])
                nums[i++] = num; 

        System.out.println(" Difference: "+i);
        System.out.println(" Array: "+Arrays.toString(nums));
    }
}
