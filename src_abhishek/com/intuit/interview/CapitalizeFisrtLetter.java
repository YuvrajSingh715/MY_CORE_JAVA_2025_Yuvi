package com.intuit.interview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CapitalizeFisrtLetter {
    public static void main(String[] args) {

        String name = "abhishek singh kushwah";

        String result = Arrays.stream(name.split(" "))
                .map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1))
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}
