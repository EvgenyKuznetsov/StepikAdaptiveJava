package org.stepik.cources;

import java.util.*;

public class TrMap {
    public static void main(String[] args){
        NavigableMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(6, "one");
        treeMap.put(2, "two");
        treeMap.put(3, "three");
        treeMap.put(4, "four");
        treeMap.put(5, "five");

        getSubMap(treeMap).forEach((key, value) -> System.out.println(key + ":" + value));
    }

    public static NavigableMap<Integer, String> getSubMap(NavigableMap<Integer, String> map) {
        if (map.firstKey() % 2 != 0) {
            return map.headMap(map.firstKey() + 4, true).descendingMap();  
        } else {
            return map.tailMap(map.lastKey() - 4, true).descendingMap();
        }   
    }
}