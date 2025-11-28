package com.Google.yuvraj.Real_Interview_codes;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {

		int[] arr = { 3, 5, 5, 1, 5, 6, 7, 3, 5, 2, 7 };

		Set<Integer> set = new HashSet<>();
		Set<Integer> duplicates = new HashSet<>();

		for (int num : arr) {
			if (!set.add(num)) {
				duplicates.add(num);
			}
		}
		System.out.println("Duplicates:" + duplicates);
	}

}
