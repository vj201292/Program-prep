package com.vj.regex;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(firstReverseTry(arr)));

    }


    static int[] firstReverseTry(int[] inputarray) {
        int len = inputarray.length - 1, temp;
        if (len > 0) {
            temp = inputarray[0];
            inputarray[0]=inputarray[len];
            inputarray[len]=temp;
        }
        return inputarray;
    }
}
