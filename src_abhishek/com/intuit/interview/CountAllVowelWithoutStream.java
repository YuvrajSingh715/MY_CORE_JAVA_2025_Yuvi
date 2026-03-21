package com.intuit.interview;

public class CountAllVowelWithoutStream {

	public static void main(String[] args) {
		String str = "abhishek singh kushwah";
		int count = 0;
		for (char c : str.toCharArray()) {
			if ("aeiou".indexOf(c) != -1) {
				count++;
			}
		}
		System.out.println(count);
	}

}
