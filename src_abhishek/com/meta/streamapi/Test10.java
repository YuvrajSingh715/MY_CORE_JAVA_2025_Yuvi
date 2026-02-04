package com.meta.streamapi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Test10 {

	public static void main(String[] args) {
		String inputString = "Java Concept Of The Day";
		String normalString = inputString.replace(" ", "").toLowerCase();
		System.out.println(normalString);
		Set<String> unique = new HashSet<>();
		Set<String> duplicateChar = Arrays.stream(normalString.split("")).filter(s -> !unique.add(s))
				.collect(Collectors.toSet());
		System.out.println(duplicateChar);

	}

}
