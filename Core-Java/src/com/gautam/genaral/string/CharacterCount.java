package com.gautam.genaral.string;

import java.util.Arrays;
import java.util.HashMap;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "Hello";

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(map.containsKey(ch) ){
                map.put(ch, map.get(ch)+1);
            } else
                map.put(ch, 1);
        }

        map.entrySet().forEach(m -> System.out.println(m.getKey()+" : "+m.getValue()));

        //Arrays.stream(str).forEach()
    }
}
