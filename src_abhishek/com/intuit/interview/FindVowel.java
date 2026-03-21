package com.intuit.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindVowel {

	public static void main(String[] args) {
		String str = "abhishek singh kushwah";
		List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
		long count = str.chars().mapToObj(c -> (char) c).filter(vowels::contains).count();
		System.out.println(count);

	}

}
