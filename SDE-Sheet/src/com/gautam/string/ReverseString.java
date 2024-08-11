package com.gautam.string;

public class ReverseString {
    public static void main(String[] args) {

        String str = "ABCDE";

        char[] chars = str.toCharArray();
        int len = str.length();
        for(int i = 0, j = len-1; i <= j; i++, j--) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }

        System.out.println(" Reversed String: "+new String(chars));
    }
}
