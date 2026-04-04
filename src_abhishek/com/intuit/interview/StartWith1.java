package com.intuit.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartWith1 {

	public static void main(String[] args) {
		List<Integer> listOfInteger = Arrays.asList(12, 34, 56, 17, 19);
		List<Integer> startWith1 = listOfInteger.stream().filter(x -> String.valueOf(x).startsWith("1"))
				.collect(Collectors.toList());

		System.out.println(startWith1);
	}

}
