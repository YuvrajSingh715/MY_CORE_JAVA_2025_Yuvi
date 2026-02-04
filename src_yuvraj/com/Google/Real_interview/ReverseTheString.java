package com.Google.Real_interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseTheString {

	public static void main(String[] args) {

		String str = "java is a programming languange";

		// characterwise reversing
		String charReverse = new StringBuilder(str).reverse().toString();
		System.out.println("Reverse string: " + charReverse);

		// wordwise reversing
		String wordReverse = Arrays.stream(str.split(" ")).map(word -> new StringBuilder(word).reverse().toString())
				.collect(Collectors.joining(" "));
		System.out.println("Reverse Words: " + wordReverse);

		// Reverse Word Order
		String reverseWordOrder = Arrays.stream(str.split(" "))
				.collect(Collectors.collectingAndThen(Collectors.toList(), List -> {
					Collections.reverse(List);
					return String.join(" ", List);
				}));

		System.out.println("Reverse Word Order: " + reverseWordOrder);

		//through the List
		List<String> rev = Arrays.asList(str.split(" "));
		Collections.reverse(rev);
		System.out.println(rev);

		//through the String
		String result = rev.stream().collect(Collectors.joining(" "));
		System.out.println(result);

	}

}
