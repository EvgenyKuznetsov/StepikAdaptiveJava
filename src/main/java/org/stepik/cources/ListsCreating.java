package org.stepik.cources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* 3.99 Lists. Creating.
 */

public class ListsCreating {
    public static void main(String[] args) {
        // List<Integer> list = List.of(2, 0, 1, 7);
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 0, 1, 7));
        System.out.println(list);
    }
}