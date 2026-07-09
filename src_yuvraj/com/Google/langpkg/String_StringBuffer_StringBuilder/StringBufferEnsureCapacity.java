package com.Google.langpkg.String_StringBuffer_StringBuilder;

public class StringBufferEnsureCapacity {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		
		System.out.println("inital capacity: " + sb.capacity());
		
		sb.ensureCapacity(45);
		
		System.out.println("After customise capacity: " + sb.capacity());
	}
	
}
