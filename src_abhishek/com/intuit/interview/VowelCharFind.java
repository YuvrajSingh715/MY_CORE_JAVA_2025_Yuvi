package com.intuit.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VowelCharFind {

	public static void main(String[] args) {
		String str = "abhishek singh kushwah";
		List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

		List<Character> vowelChar = str.chars().mapToObj(c -> (char) c).filter(c -> vowels.contains(c))
				.collect(Collectors.toList());
		System.out.println(vowelChar);
	}
}
