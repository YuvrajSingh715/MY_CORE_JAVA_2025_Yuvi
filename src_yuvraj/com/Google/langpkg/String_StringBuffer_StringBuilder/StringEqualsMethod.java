package com.Google.langpkg.String_StringBuffer_StringBuilder;

public class StringEqualsMethod {

	public static void main(String[] args) {
		
		String s1 = new String("Marcela");
		String s2 = new String("Marcela");
		String s3 = new String("MarCela");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
	}
}

//equals() ment for content comparision where the case is also important;