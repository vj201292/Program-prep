package com.vj.oct1st;

/* Write a Java Program to reverse a string without using String inbuilt function*/

public class Program1 {

    public static void main(String[] args) {
        revString("string");

        revString2("abcdefghi");
    }

    private static void revString2(String string) {
        char arr[] = string.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);

        }
    }

    private static void revString(String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            sb.append(string.charAt(i));
        }
        System.out.println(sb);
    }
}
