package com.Google.langpkg.String_StringBuffer_StringBuilder;

public class StringDemo5 {

	public static void main(String[] args) {

		String s1 = new String("you can't change me!");
		String s2 = new String("you can't change me!");
		System.out.println("s1 == s2: " + (s1 == s2)); // false: both references are different
		System.out.println("s1: " + s1.hashCode() + "  ||  s2: " + s2.hashCode());
		System.out.println(System.lineSeparator());

		String s3 = "you can't change me!";
		String s4 = "you can't change me!";
		System.out.println("s1 == s3: " + (s1 == s3)); // false
		System.out.println("s1: " + s1.hashCode() + "  ||  s3: " + s3.hashCode());
		System.out.println("s1 == s4: " + (s1 == s4)); // false
		System.out.println("s1: " + s1.hashCode() + "  ||  s4: " + s4.hashCode());
		System.out.println(System.lineSeparator());

		String s5 = "you can't " + "change me!";
		System.out.println("s3 == s5: " + (s3 == s5)); // true

		String s6 = "you can't";
		String s7 = s6 + " change me!";
//D		System.out.println("s3 == s7: "+(s3 == s7)); // false
	
		final String s8 = "you can't"; //s8 is a constant variable now by the final key word;
		String s9 = s8 + " change me!";
		System.out.println("s3 == s9: "+(s3 == s9)); //true
		System.out.println("s6 == s8: "+(s6 == s8)); //true
		
		
	}

}
