package com.Google.langpkg.String_StringBuffer_StringBuilder;

public class StringConstructor {
	
	public static void main(String[] args) {
		
		char[] c = {'d','y','w','i','s'};
		
		String s1 = new String(c);
		
		System.out.println(s1);
		
		String s2 = new String("drago");
		
		System.out.println(s2);
		
	}

}

/*
 * there are a lot of constructor in string class. here we are meantioning a few
 * constructors
 * 
 * 1. String s1 = new String(); 
 * 2. String s2 = new String(String constant); 
 * 3. String s3 = new String(StringBuffer sb); 
 * 4. String s4 = new String(char[] ch); 
 * 5. String s5 = new String(byte[] b);
 * 
 */