package com.Google.langpkg.String_StringBuffer_StringBuilder;

public class StringEqualsIgnoreCaseMethod {

	public static void main(String[] args) {

		String s1 = new String("Marcela");
		String s2 = new String("Marcela");
		String s3 = new String("MarCela");

		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));

	}

}

//equalsIgnoreCase() ment for content comparision where the case is not important;