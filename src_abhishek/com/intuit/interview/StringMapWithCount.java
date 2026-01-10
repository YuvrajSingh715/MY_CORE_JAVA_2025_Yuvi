package com.intuit.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringMapWithCount {

	public static void main(String[] args) {

		String input[] = { "JAva", "spring", "boot", "api" };

		// o/p = {3=[api], 4=[JAva, boot], 6=[spring]} map with length
		List<String> list = Arrays.asList(input);
		Map<Integer, List<String>> mapString = list.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(mapString);

	}

}
