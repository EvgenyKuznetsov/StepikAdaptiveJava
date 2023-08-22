package org.stepik.cources;
/*
* 1.22 Shape
 */

import java.util.Scanner;

public class Shape {
    private static final String BASE = "You have chosen a %s", DEFT = "There is no such shape!";
    private static final String SQUARE = "square", CIRCLE = "circle", TRIANGLE = "triangle", RHOMBUS = "rhombus";
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            switch (scanner.nextInt()) {
                case 1: System.out.printf(BASE, SQUARE); break;
                case 2: System.out.printf(BASE, CIRCLE); break;
                case 3: System.out.printf(BASE, TRIANGLE); break;
                case 4: System.out.printf(BASE, RHOMBUS); break;
                default: System.out.println(DEFT);
            }
        }
    }
}