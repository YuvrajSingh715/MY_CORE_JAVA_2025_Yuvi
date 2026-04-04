package com.intuit.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SameElementInArray3 {

	public static void main(String[] args) {
		int[] arr1 = { 2, 3, 4, 5, 6, 7, 8 };
		int[] arr2 = { 4, 5, 6, 7, 8, 9, 2 };
		Set<Integer> set2 = Arrays.stream(arr2).boxed().collect(Collectors.toSet());

		List<Integer> common = Arrays.stream(arr1).filter(set2::contains).boxed().collect(Collectors.toList());
		System.out.println(common);
	}

}
