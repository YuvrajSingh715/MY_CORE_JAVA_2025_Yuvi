package com.abhi.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(12, 34, 56, 78, 90,13,57);

        Map<Boolean, List<Integer>> evenOdd =
                numbers.stream()
                       .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        Set<Entry<Boolean, List<Integer>>> entrySet = evenOdd.entrySet();

        for (Entry<Boolean, List<Integer>> entry : entrySet) {

            System.out.println("===================");

            if (entry.getKey()) {
                System.out.println("Even Numbers");
            } else {
                System.out.println("Odd Numbers");
            }

            System.out.println("===================");

            List<Integer> values = entry.getValue();
            for (int i : values) {
                System.out.println(i);
            }
        }
    }
    
}
