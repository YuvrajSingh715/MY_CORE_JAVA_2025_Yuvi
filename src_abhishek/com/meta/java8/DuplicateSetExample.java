package com.meta.java8;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateSetExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10,20,30,20,40,10,10,10,10);

        Set<Integer> seen = new HashSet<>();

        List<Integer> duplicates = numbers.stream()
                .filter(n -> !seen.add(n))  // seen.add(n) returns false on duplicates
                .distinct()                 // avoid repeating duplicates
                .collect(Collectors.toList());

        System.out.println("Duplicates: " + duplicates);
    }
}

