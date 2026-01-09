package com.abhi.streamapi;

public class Test2 {

	public static void main(String[] args) {
		String str = "Abhishek Singh Kushwah";
		String rev = "";
		for (int i = str.length() - 1; i > 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev.replace(" ", ""));
	}

}
