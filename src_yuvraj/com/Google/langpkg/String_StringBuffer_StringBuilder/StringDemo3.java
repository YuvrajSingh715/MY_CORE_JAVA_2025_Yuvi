package com.Google.langpkg.String_StringBuffer_StringBuilder;

public class StringDemo3 {
	
	public static void main(String[] args) {
		
		String s1 = new String("summer");
		
		s1.concat("time");
		s1.concat("sadness");
		
		String s2 = s1.concat("direwolf");
		
		System.out.println(s1);
		System.out.println(s2);
		
		String s3 = "tyrion" + new String("lannister");
		
		System.out.println(s3);
		
	}

}

//Heap memory: summer(s1), summertime, summersadness, summerdirewolf(s2);
//SCP memory: summer, time, sadness, direwolf;