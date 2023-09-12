package org.stepik.cources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UsingStreamAPIwithCollections {
    public static void main(String[] args){
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            List<String> list = Arrays.asList(br.readLine().split(" "));
            List<String> result = list.stream()
                    .filter(word -> word.startsWith("J"))
                    .map(word -> word.replaceFirst("J", ""))
                    .collect(Collectors.toList());
            Collections.reverse(result);
            result.forEach(System.out::println);
            
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}