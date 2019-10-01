package com.vj.oct1st;
/*word count*/

import java.util.HashMap;

public class Program3 {

    public static void main(String[] args) {

        wordFreq("abcddeeab");
    }

    private static void wordFreq(String string) {
        char[] charArray = string.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<>();
        for (char c : charArray) {
            if (!hm.containsKey(c)){
                hm.put(c,1);
            }else {
                hm.put(c,hm.get(c)+1);
            }
        }
        System.out.println(hm);
    }
}
