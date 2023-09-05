package org.stepik.cources;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/*
* 3.106 Sets. Bypassing.
 */

public class SetsBypassing {
    public static void main(String[] args){
        Set<String> nameSet = new TreeSet<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
        nameSet.forEach(System.out::println);
        
    }
}