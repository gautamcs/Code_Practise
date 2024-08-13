package com.gautam.string;

import java.util.Arrays;

public class MergeWord {
    public static void  mergeAlternately(String word1, String word2) {

        int len1 = word1.length();
        int len2 = word2.length();

        char[] str = new char[len1+len2];
        int k = 0;
        for(int i = 0, j = 0; len1 > 0 || len2 > 0; i++, j++) {
            if(len1 > 0) {
                str[k] = word1.charAt(i);
                len1--;
                k++;
            }
            if(len2 > 0) {
                str[k] = word2.charAt(j);
                len2--;
                k++;
            }
        }

        String temp = new String(str);
        System.out.println(" Final String: "+temp);
        System.out.println(Arrays.toString(str));
    }

    public static void main(String[] args) {

        MergeWord.mergeAlternately("ABC", "XYZ");
    }
}
