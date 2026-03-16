package com.Google.langpkg.String_StringBuffer_StringBuilder;

public class StringInteringMeth1 {

	public static void main(String[] args) {
		
		String s1 = new String("cersei");
		
		String s2 = s1.intern();
		
		System.out.println(s1 == s2);
		
		String s3 = "cersei";
		
		System.out.println(s3 == s2);
	
	}
	
}
