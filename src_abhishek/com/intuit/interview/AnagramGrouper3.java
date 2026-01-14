package com.intuit.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnagramGrouper3 {

	public static void main(String[] args) {

		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };

		Map<String, List<String>> result = Arrays.stream(strs).collect(Collectors.groupingBy(word -> {
			char[] ch = word.toCharArray();
			Arrays.sort(ch);
			return new String(ch); 
		}));

		System.out.println(result);
	}
}
