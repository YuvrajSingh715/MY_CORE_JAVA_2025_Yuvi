package com.Google.langpkg.String_StringBuffer_StringBuilder;

public class StringBufferTrimToSizeMethod {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		System.out.println("initial capacity: " + sb.capacity());

		sb.ensureCapacity(75);
		System.out.println("updated capacity: " + sb.capacity());
		
		sb.append("Have you ever see the demogorgon");

		sb.trimToSize();

		System.out.println("final result: " + sb.capacity());

	}

}

//to release extra allocated free memory. after calling this method length and capacity will be equal;
