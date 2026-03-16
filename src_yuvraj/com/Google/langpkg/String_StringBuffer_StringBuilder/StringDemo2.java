package com.Google.langpkg.String_StringBuffer_StringBuilder;

public class StringDemo2 {
	
	public static void main(String[] args) {
		
		String s1 = new String("Hound");
		String s2 = new String("Hound");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
	}
	
}

//equals() is overridden in String class.