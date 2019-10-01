package com.vj.ps;

import java.util.Scanner;

public class Test6 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int[] newArray = new int[arr.length+1];

        for (int i : arr) {
            newArray[i] = 1;
        }
        for (int i = 1; i < newArray.length; i++) {
            if (newArray[i] == 0) {
                System.out.print(i+" ");
            }
        }
    }
}
