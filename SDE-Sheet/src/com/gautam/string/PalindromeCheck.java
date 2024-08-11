package com.gautam.string;

public class PalindromeCheck {
    public static void main(String[] args) {

        String str = "ANNA";

        char[] chars = str.toCharArray();
        int len = str.length();
        boolean flag = true;
        for(int i = 0, j = len-1; i <= j; i++, j--) {
            if(chars[i] != chars[j]) {
                System.out.println(" String is not Palindrome ");
                flag = false;
            }
        }
        if(flag)
            System.out.println(" String is Palindrome... ");
    }
}
