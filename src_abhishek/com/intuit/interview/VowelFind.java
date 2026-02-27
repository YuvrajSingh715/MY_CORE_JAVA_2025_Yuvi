package com.intuit.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VowelFind {

	public static void main(String[] args) {
		List<String> listOfString = Arrays.asList("aab", "xyz", "iiu");

		List<Character> vowels = listOfString.stream().flatMap(s -> s.toLowerCase().chars().mapToObj(c -> (char) c))
				.filter(ch -> "aeiou".indexOf(ch) != -1).collect(Collectors.toList());

		System.out.println(vowels);

	}
}
