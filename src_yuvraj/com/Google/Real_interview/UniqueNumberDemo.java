package com.Google.Real_interview;

public class UniqueNumberDemo {

	public static void main(String[] args) {

		int[] a = { 2, 3, 5, 3, 6, 7 };

		for (int i = 0; i < a.length; i++) {

			int count = 0;

			for (int j = 0; j < a.length; j++) {
				 if (a[i] == a[j])
					count++;
			}

			if (count == 1) {
				System.out.println(a[i]);
			}	
		}
	}
}
