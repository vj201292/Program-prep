package com.vj.oct1st;

/* Write a Java Program to count the number of words in a string using HashMap.*/

import java.util.HashMap;

public class Program2 {

    public static void main(String[] args) {
        freqCount("This this is is done by Saket Saket");
    }

    private static void freqCount(String string) {
        String strArray[] = string.split(" ");
        HashMap<String, Integer> hm = new HashMap<>();
        for (String s : strArray) {
            if (!hm.containsKey(s)) {
                hm.put(s, 1);
            } else {
                hm.put(s, hm.get(s) + 1);
            }
        }
        System.out.println(hm);
    }
}
