package com.Google.langpkg.String_StringBuffer_StringBuilder;

public class StringDemo4 {

	public static void main(String[] args) {
		
		String s1 = "King's";
		
		String s2 = s1 + "winter";
		
		s1.concat("Capital");
		s2.concat(s1);
		s1 += "Landing";
		
		System.out.println(s1);
		System.out.println(s2);
		
	}
	
}

//Heap memory: king'swinter, king'sCapital, king'swinterking's, king'sLanding;
//king's, winter, Capital, Landing;