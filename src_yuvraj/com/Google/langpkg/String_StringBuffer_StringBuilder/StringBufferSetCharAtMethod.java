package com.Google.langpkg.String_StringBuffer_StringBuilder;

public class StringBufferSetCharAtMethod {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Wintrrfall");

		sb.setCharAt(4, 'e');

		System.out.println("After updating 4th index: " + sb);

	}

}

//to replace the character locating at specified index with the provided character;