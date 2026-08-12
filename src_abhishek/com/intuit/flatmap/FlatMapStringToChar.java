package com.intuit.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapStringToChar {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("java", "stream");

		List<Character> chars = words.stream().flatMap(word -> word.chars().mapToObj(c -> (char) c))
				.collect(Collectors.toList());

		System.out.println(chars);
	}

}
