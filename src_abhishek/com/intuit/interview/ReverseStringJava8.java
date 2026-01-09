package com.intuit.interview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseStringJava8 {

	public static void main(String[] args) {
		String str = "Good Moring";
		String reversedStr = Arrays.stream(str.replace(" ","").split(" ")).map(word -> new StringBuffer(word).reverse())
				.collect(Collectors.joining(" "));
		System.out.println(reversedStr);
	}

}
