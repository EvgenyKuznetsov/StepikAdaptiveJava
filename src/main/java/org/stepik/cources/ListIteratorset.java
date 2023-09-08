package org.stepik.cources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
* 3.21 ListIterarot. set().
 */

public class ListIteratorset {
    public static void main(String[] args){
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            List<String> list = new LinkedList<>(Arrays.asList(reader.readLine().split(" ")));
            ListIterator<String> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                listIterator.next();
            }
            while (listIterator.hasPrevious()) {
                String s = "";
                if ((s = listIterator.previous()).startsWith("J")) {
                    System.out.println(s = s.replaceFirst("J", ""));
                    listIterator.set(s);
                } else {
                    listIterator.remove();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}