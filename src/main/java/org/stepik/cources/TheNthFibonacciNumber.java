package org.stepik.cources;

import java.util.Scanner;

/*
* 1.157 The N-th Fibonacci Number
 */

public class TheNthFibonacciNumber {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int[] f = new int[n + 1];
            f[0] = 0;
            if (n > 0) {
                f[1] = 1;
                for (int i = 2; i <= n; i++) {
                    f[i] = f[i - 1] + f[i - 2];
                }
            }
            System.out.println(f[n]);
        }
    }
}