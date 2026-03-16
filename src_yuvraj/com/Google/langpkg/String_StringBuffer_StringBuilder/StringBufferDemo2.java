package com.Google.langpkg.String_StringBuffer_StringBuilder;

public class StringBufferDemo2 {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("Aegon");
		StringBuffer sb2 = new StringBuffer("Aegon");
		
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
		
	}

}

//equals() is not overridden in StringBuffer class.