package org.stepik.cources;

import java.util.Scanner;
/*
* 1.46 Squares of Natural Numbers
 */
public class SquaresOfNaturalNumbers {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for (int i = 1; i * i <= n; i++) {
                System.out.println(i * i);
            }
        }
    }
}