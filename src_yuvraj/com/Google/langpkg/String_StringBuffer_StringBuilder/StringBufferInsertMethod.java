package com.Google.langpkg.String_StringBuffer_StringBuilder;

public class StringBufferInsertMethod {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("abcdijkl");
		
		sb.insert(4, "efgh");
		
		System.out.println("After using the insert method: " + sb);
	}
	
}
