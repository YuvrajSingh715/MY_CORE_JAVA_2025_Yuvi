package com.Google.langpkg.String_StringBuffer_StringBuilder;

public class StringDemo6 {

	public static void main(String[] args) {

		String s1 = "davos";
		String s2 = s1.toUpperCase();
		String s3 = s1.toLowerCase();
		String s4 = s2.toUpperCase();
		String s5 = s1.toString();

		System.out.println("s1 == s2: " + (s1 == s2));
		System.out.println("s1 == s3: " + (s1 == s3));
		System.out.println("s1 == s5: " + (s1 == s5));
		System.out.println("s2 == s4: " + (s2 == s4));
		

	}

}
