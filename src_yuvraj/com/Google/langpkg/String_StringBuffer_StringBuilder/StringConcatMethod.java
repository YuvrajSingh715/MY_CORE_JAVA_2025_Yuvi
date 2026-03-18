package com.Google.langpkg.String_StringBuffer_StringBuilder;

public class StringConcatMethod {
	
	public static void main(String[] args) {
		
		String s = "tyrion";

		s = s.concat("Lannister");
		
		s = s + "Barathion";
		
		System.out.println(s);
		
	}
}

// the overloaded +, += operatrs also ment for concatination only;