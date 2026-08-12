package com.intuit.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnagramGroupWord {

	public static void main(String[] args) {
		List<String> input = Arrays.asList("listen", "silent", "enlist", "rat", "tar", "god", "dog");

		Map<String, List<String>> anagramGroups = input.stream().collect(Collectors.groupingBy(word -> {
			char[] arr = word.toCharArray();
			Arrays.sort(arr);
			return new String(arr);
		}));

		System.out.println(anagramGroups);

	}

}
