package com.Google.langpkg.String_StringBuffer_StringBuilder;

public class StringInteringMeth2 {
	
	public static void main(String[] args) {
		
		String s1 = new String("Recone");
		String s2 = s1.concat("Stark");
		
		String s3 = s2.intern();
		String s4 = "ReconeStark";
		
		System.out.println(s3 == s4);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
	}

}

//Heap memory: Recone(s1), ReconeStark(s2)
//scp memory: Recone(s1), Stark, ReconeStark(s3, s4);