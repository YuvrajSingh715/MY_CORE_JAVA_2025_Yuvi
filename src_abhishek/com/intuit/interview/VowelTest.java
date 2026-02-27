package com.intuit.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VowelTest {

	public static void main(String[] args) {
		List<String> listOfString = Arrays.asList("aab", "xyz", "iiu");
		List<Character> vowels = new ArrayList<>();
		for (String s : listOfString) {
			for (char ch : s.toCharArray()) {
				if ("aeiou".indexOf(ch) != -1) {

					vowels.add(ch);

				}
			}

		}

		System.out.println(vowels);
	}

}
