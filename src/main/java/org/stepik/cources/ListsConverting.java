package org.stepik.cources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListsConverting {
    public static void main(String[] args){
        List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
        String[] strArray = nameList.toArray(new String[0]);
        
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        } 
    }
}