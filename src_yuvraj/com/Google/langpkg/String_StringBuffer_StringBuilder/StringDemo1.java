package com.Google.langpkg.String_StringBuffer_StringBuilder;

public class StringDemo1 {
	
	public static void main(String[] args) {
		
		String s1 = new String("Brandin");
		String s2 = "Brandin";
		
		System.out.println(s1 == s2);
//		System.out.println(s1.hashCode() + " & " + s2.hashCode());
		System.out.println(s1.equals(s2));
		System.out.println(s1);
		System.out.println(s2);
	
	}

}

//here one time object creation is happened Because both references point to the same SCP object. 