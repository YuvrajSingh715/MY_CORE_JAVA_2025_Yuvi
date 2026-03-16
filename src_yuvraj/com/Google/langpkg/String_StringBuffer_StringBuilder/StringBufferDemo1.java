package com.Google.langpkg.String_StringBuffer_StringBuilder;

public class StringBufferDemo1 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Arya ");
		
		sb.append("Stark");  // append will not work. Cause string is mutable class.
		
		System.out.println(sb);
		
	}
	
}
