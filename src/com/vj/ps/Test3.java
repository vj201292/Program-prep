package com.vj.ps;

import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        String arr = in.next();

        System.out.println(arr.length()-arr.replace(".","").length());



    }
}
