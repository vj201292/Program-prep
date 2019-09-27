package com.vj.ps;

/*Find the sum of all divisors of a given integer.*/

public class Test2 {

    public static void main(String[] args) {

      sumOfDivisors(12);


    }

   static int sumOfDivisors(int n) {
        int r = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                r += i;
                if (n / i != i)
                    r += n / i;
            }
        }
        return r;
    }
}
