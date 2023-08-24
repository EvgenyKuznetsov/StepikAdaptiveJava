package org.stepik.cources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
* 3.19 Iterator
 */

public class Iterator {
    public static void main(String[] args){
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            String[] line = bf.readLine().split(" ");
            List<Integer> list = new ArrayList<>();
            for (String s : line) {
                list.add(Integer.parseInt(s));
            }
            Collections.sort(list);
            list.removeIf(n -> n % 2 == 0);
            list.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}