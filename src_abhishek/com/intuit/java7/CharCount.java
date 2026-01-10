package com.intuit.java7;

public class CharCount {

	public static void main(String[] args) {

		String s = "abhisheksinghkushwah";
		char[] a = s.toCharArray();

		for (int i = 0; i < a.length; i++) {

			int count = 1;

			// skip already counted characters
			if (a[i] == '\0') {
				continue;
			}

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					a[j] = '\0'; // mark as counted
				}
			}

			System.out.println("count of " + a[i] + " = " + count);
		}
	}
}
