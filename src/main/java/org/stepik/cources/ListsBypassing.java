package org.stepik.cources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* 3.100 Lists. Bypassing.
 */

public class ListsBypassing {
    public static void main(String[] args){
        List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
        nameList.forEach(System.out::println);
    }
}