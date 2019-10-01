package com.vj.CF;

public class Prog1 {

    public static void main(String[] args) {

        System.out.println(numberOfEvenDigits(135));
    }

    static int numberOfEvenDigits(int n) {
        String s = Integer.toString(n);
        int[] intArray = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            intArray[i] = Character.getNumericValue(s.charAt(i));
        }
        int countEven = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 0)
                countEven++;
        }
        return countEven;
    }
}
