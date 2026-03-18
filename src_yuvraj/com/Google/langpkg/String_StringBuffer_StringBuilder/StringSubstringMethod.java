package com.Google.langpkg.String_StringBuffer_StringBuilder;

public class StringSubstringMethod {
	
	public static void main(String[] args) {
		
		String s = "qwertyuiop";
		
		//public String substring(int beginIndex);
		System.out.println(s.substring(4));
		
		//public String substring(int beginIndex, int endIndex);
		System.out.println(s.substring(2, 6));
	}

}

//Begin Index: returns the substring from begin index to end of the string;
//End Index: returns the substring from begin index to end-1 index; 