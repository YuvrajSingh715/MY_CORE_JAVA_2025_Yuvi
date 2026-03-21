package com.intuit.interview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StartWordWithCapital {

	public static void main(String[] args) {
		String str = "abhishek singh kushwah";
		String result = Arrays.stream(str.split(" ")).map(word -> word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase())
				.collect(Collectors.joining(" "));
		System.out.println(result);

	}

}
