package com.gautam.string;

// https://leetcode.com/problems/reverse-vowels-of-a-string/?envType=study-plan-v2&envId=leetcode-75
public class ReverseVowelOfString {
    public static boolean checkVowel(char ch) {
        if( ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' ||
                ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' ||
                ch == 'u' || ch == 'U') {
            return true;
        } else
            return false;
    }
    public static void main(String[] args) {

        String str = "BCDFAEKL";

        char[] chars = str.toCharArray();
        int len = str.length() -1;

        String vowels = "aeiouAEIOU";

//        for(int i = 0; i <= len; i++) {
//            char ch = chars[i];
//            System.out.println(" Vowel Status of: "+ch+" -> "+vowels.indexOf(ch));
//        }
        int start = 0;
        while( start < len) {

            while(start < len && vowels.indexOf(chars[start]) == -1) {
                start++;
            }

            while(start < len && vowels.indexOf(chars[len]) == -1) {
                len--;
            }

            char temp = chars[start];
            chars[start] = chars[len];
            chars[len] = temp;

            start++;
            len--;

        }
//        for(int i = 0, j = len; i < j; i++) {
//            if(ReverseVowelOfString.checkVowel(chars[i]) )  {
//                while(i < j) {
//                    if (ReverseVowelOfString.checkVowel(chars[j])) {
//                        char temp = chars[i];
//                        chars[i] = chars[j];
//                        chars[j] = temp;
//                    } else
//                        j--;
//                }
//            }
//        }

        System.out.println(" Reversed String: "+new String(chars));
    }
}
