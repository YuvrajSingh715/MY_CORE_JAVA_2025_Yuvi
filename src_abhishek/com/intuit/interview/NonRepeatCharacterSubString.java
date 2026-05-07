package com.intuit.interview;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class NonRepeatCharacterSubString {

	/*
	 * Find length of longest substring without repeating characters. Example:
	 * "abcabcbb" → 3 ("abc")
	 */

	public static void main(String[] args) {
		String str = "abcabcbb";

		int maxLength = IntStream.range(0, str.length()).map(i -> {
			Set<Character> set = new HashSet<>();
			int length = 0;

			for (int j = i; j < str.length(); j++) {
				char c = str.charAt(j);
				if (set.contains(c))
					break;
				set.add(c);
				length++;
			}
			return length;
		}).max().orElse(0);

		System.out.println("Longest substring length: " + maxLength);
	}
}
