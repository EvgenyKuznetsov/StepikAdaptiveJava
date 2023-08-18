package org.stepik.cources;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
* 3.111 Queues and Stacks. Creating.
 */
public class QueuesStacksCreating {
    
    public static void main(String[] args){
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(2);
        queue.add(0);
        queue.add(1);
        queue.add(7);
        System.out.println(queue);

        queue = new ArrayDeque<>(4);
        queue.offer(2);
        queue.offer(0);
        queue.offer(1);						
        queue.offer(7);
        System.out.println(queue);
        
        queue = new ArrayDeque<>(Stream.of(2, 0, 1, 7).collect(Collectors.toList()));
        System.out.println(queue);

        queue = Stream.of(2, 0, 1, 7).collect(Collectors.toCollection(ArrayDeque::new));
        System.out.println(queue);
    }
}