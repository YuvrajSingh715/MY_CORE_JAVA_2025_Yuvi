package com.Google.langpkg.String_StringBuffer_StringBuilder;

public class StringBufferAppendMethod {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Jon");
		sb.append("Snow");
		System.out.println("1st append: " + sb);
		
		sb.append(true);
		System.out.println("2nd append: " + sb);

		sb.append('l');
		System.out.println("3nd append: " + sb);
		
		sb.append(96.55);
		System.out.println("4nd append: " + sb);
		
		sb.append(32);
		System.out.println("5nd append: " + sb);
		
		StringBuffer sb1 = new StringBuffer("Ending");
		sb.append(sb1);
		System.out.println("6nd append: " + sb1);
		
	}
	
}
