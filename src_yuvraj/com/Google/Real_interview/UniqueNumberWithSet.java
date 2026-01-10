package com.Google.Real_interview;

import java.util.HashSet;

public class UniqueNumberWithSet {

	public static void main(String[] args) {

		int[] a = { 2, 3, 5, 3, 6, 7 };

		HashSet set = new HashSet();

		for (int num : a) {
			set.add(num);

			System.out.print(num + ", ");
		}

	}

}
