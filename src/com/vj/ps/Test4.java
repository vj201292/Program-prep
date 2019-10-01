package com.vj.ps;

public class Test4 {

    public static void main(String[] args) {

        // given input
        int[] input = {1,2,3,3,4,6,4};

        // let's create another array with same length
        // by default all index will contain zero
        // default value for int variable

        int[] register = new int[input.length+1];
        System.out.println(register.length);

        // now let's iterate over given array to
        // mark all present numbers in our register
        // array

        for (int i : input) {
            register[i] = 1;
        }

        // now, let's print all the absentees
        System.out.println("missing numbers in given array");

        for (int i = 1; i < register.length; i++) {
            if (register[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
