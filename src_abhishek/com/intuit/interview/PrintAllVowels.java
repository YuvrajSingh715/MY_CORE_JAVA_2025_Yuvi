package com.intuit.interview;

import java.util.stream.Collectors;

public class PrintAllVowels {

	public static void main(String[] args) {
		String str = "abhishek singh kushwah";
		String result = str.chars().mapToObj(c -> (char) c).filter(c -> "aeiou".indexOf(c) != -1).map(String::valueOf)
				.collect(Collectors.joining());
		System.out.println(result);
	}

}
