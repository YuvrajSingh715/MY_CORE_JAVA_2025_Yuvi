package com.intuit.interview;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class VowelCharCount {

	public static void main(String[] args) {
		String str = "abhishek singh kushwah";

		Map<Character, Long> count = str.chars().mapToObj(c -> (char) c).filter(c -> "aeious".indexOf(c) != -1)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(count);
	}

}
