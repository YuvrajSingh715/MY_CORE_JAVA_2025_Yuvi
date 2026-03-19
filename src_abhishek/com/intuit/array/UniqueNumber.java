package com.intuit.array;

import java.util.HashSet;
import java.util.Set;

public class UniqueNumber {

	public static void main(String[] args) {
		int[] arr = { 12, 34, 56, 78, 34, 45, 34 };

		Set<Integer> set = new HashSet<>();
		for (int num : arr) {
			set.add(num);
		}
		System.out.println(set);
	}

}
