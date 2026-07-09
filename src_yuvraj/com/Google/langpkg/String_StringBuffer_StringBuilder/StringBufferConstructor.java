package com.Google.langpkg.String_StringBuffer_StringBuilder;

public class StringBufferConstructor {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		System.out.println("Initial capacity: " + sb.capacity());
	
		sb.append("abcdefghijklmnop"); 
		System.out.println("String capacity: "+sb.capacity());
		
		sb.append("x");
		System.out.println("updated capacity: "+sb.capacity());
		
	}
	
}

//default initial capacity of string buffer is 16;
//once stringbuffer reaches its max capacity a new object will be created with
// -> new capacity = (current capacity + 1)*2