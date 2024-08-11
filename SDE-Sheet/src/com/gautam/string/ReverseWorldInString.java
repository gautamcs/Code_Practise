package com.gautam.string;

import java.util.Arrays;

// https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=leetcode-75
public class ReverseWorldInString {
    public static void main(String[] args) {

        String str = "the sky is blue";

        String[] strings = str.split(" ");
        int len = strings.length - 1;

        for(int i = 0, j = len; i <= j; i++, j--) {
            String temp = strings[i];
            strings[i] = strings[j];
            strings[j] = temp;
        }

       // System.out.println(" Reversed String : "+ Arrays.toString(strings));
        String temp = "";
        for(String string : strings) {
            temp = temp + string +" ";
        }
        System.out.println(" Reversed String: "+temp);
    }
}
