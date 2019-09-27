package com.vj.ps;

/*Find the number of elements that are contained in both of the given arrays.
 * */

public class Test1 {

    public static void main(String[] args) {

        int arr1[] = {1, 2, 3};
        int arr2[] = {2, 4, 1};

        sameElementCount(arr1, arr2);
    }

    static int sameElementCount(int arr1[], int arr2[]) {
        int count = 0;
        for (int i : arr1) {
            for (int j : arr2) {
                if (i == j)
                    ++count;
            }
        }
        return count;
    }
}