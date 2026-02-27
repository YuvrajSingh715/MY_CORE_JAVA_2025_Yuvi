package com.intuit.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class VowelUniqueFind {

	public static void main(String[] args) {
		List<String> listOfString = Arrays.asList("aab", "xyz", "iiu");
		Set<Character> uniqueVowels = listOfString.stream().flatMap(s ->s.toLowerCase().chars().mapToObj(c ->(char)c))
				.filter(ch -> "aeiou".indexOf(ch) != -1).collect(Collectors.toSet());
		System.out.println(uniqueVowels);
		
	}

}
