package com.Google.yuvraj.flow.control.Iterative.Stat;

public class ForLoopReverseString {

	public static void main(String[] args) {

		String name = "yuvraj";
		String reverse = "";
		int size = name.length();

		for (int i = size - 1; i >= 0; i--) {

			reverse = reverse + name.charAt(i);

		}

		System.out.println("the reverse order of string = " + reverse);
	}

}
