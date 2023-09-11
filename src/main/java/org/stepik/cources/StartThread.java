package org.stepik.cources;

/*
* 3.121 Start a thread
 */

public class StartThread {
    public static void main(String[] args){
        new Thread(() -> System.out.println("Started")).start();
    }
}