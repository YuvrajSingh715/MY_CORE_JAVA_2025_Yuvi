package com.intuit.interview;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringUniqueCharacter {

	public static void main(String[] args) {
		String str = "java";
		Map<Character,Long> result  =    str.chars().distinct().mapToObj(c ->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        result.entrySet().stream().forEach(System.out::println);
		
		
	}

}
