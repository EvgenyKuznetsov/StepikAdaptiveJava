package org.stepik.cources;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/*
* 3.122 Queues and Stacks. Different operations.
*/

public class QaSDifferentOperations {
    
    public static void main(String[] args){
        Deque<Integer> queue = new ArrayDeque<>(Arrays.asList(1,2,3,4));
        queue.addLast(5);
        queue.removeFirst();
        queue.pollFirst();
        System.out.println(queue);
    }
}