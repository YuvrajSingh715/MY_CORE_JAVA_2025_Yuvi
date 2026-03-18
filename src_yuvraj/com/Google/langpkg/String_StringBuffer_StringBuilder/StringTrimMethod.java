package com.Google.langpkg.String_StringBuffer_StringBuilder;

public class StringTrimMethod {

	public static void main(String[] args) {

		String s1 = " Ramsay"; // Length() = 7
		System.out.println("Trimed string s1: " + s1.trim());
		System.out.println("Length of s1: " + s1.trim().length());

		String s2 = " Oberyn "; // Length() = 8
		System.out.println("Trimed string s2: " + s2.trim());
		System.out.println("Length of s2: " + s2.trim().length());

	}

}

//to remove the blank spaces present at begining & end of string but not blankspaces present at middle of the string;
