package com.Google.langpkg.String_StringBuffer_StringBuilder;

public class StringDemo0 {
	
	public static void main(String[] args) {
		
		String s = new String("Sir Jemi");
		
		s.concat("King's Layer");  // concat will not work. Cause string is immutable class.
		
		System.out.println("value of S: "+s);
		
	}

}
