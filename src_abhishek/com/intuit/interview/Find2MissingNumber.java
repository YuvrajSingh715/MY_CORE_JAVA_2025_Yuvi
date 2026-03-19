package com.intuit.interview;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Find2MissingNumber {
	public static void main(String[] args) {
		int[] a = { 93, 94, 97, 92, 98, 91,95 };
		int min = Arrays.stream(a).min().getAsInt();
		int max = Arrays.stream(a).max().getAsInt();

		Set<Integer> set = Arrays.stream(a).boxed().collect(Collectors.toSet());

		IntStream.rangeClosed(min, max).filter(x -> !set.contains(x)).forEach(System.out::println);

	}

}
