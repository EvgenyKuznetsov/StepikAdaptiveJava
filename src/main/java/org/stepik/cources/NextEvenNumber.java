package org.stepik.cources;

import java.util.Scanner;

/*
* 1.8 next even number
*/

public class NextEvenNumber {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            int n;
            System.out.println(( n = scanner.nextInt() + 1) % 2 == 0 ? n : n + 1);
        }
    }
}