package org.stepik.cources;

import java.util.ArrayList;
import java.util.List;

public class ListsBigDeal {
    public static void main(String[] args){
        List<Integer> delList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            delList.add(i);
        }


        //*** change this code which raises ConcurrentModificationException
        delList.removeIf(n -> n < 10);
        //***


        System.out.println(delList);
    }
}