package com.Google.yuvraj.Real_interview;

import java.util.HashSet;
import java.util.Set;

public class DuplicateDemo {

	public static void main(String[] args) {

		int[] arr = { 2, 2, 1, 4, 5, 7, 9, 7, 0, 0 }; // ans 2,7,0
		Set<Integer> set = new HashSet<>();

		Set<Integer> duplicates = new HashSet<>();

		for (int num : arr) {
			if (!set.add(num)) {
				duplicates.add(num);
			}
		}

		System.out.println("Duplicates: " + duplicates);

	}

}
