package com.persistent.operators;

public class TestEqualityOpeDemo3 {

	public static void main(String[] args) {

		EqualityOpeDemo3 eod1 = new EqualityOpeDemo3(5342358, "Yuvraj Singh");
		EqualityOpeDemo3 eod2 = new EqualityOpeDemo3(5342358, "Yuvraj Singh");
	
		// In this case Here, both classes reference (like hashCode) are compared
		System.out.println(eod1 == eod2); 
		System.out.println(eod1.equals(eod2)); //Here, {equals} behaves like {==} because there is no relationship between these objects
		System.out.println(eod1 != eod2);

		
		String str1 = new String("Franklen");
		String str2 = new String("Franklen");
		String str3 = new String("Yuvraj Singh");
				
		// In this case Here, both classes reference comparison & string content are compared
		System.out.println(str1.equals(str2));  //here {equals} compare the content of the string because String class is overridden
		System.out.println(str1 == str2);       // reference comparison because there is no relationship between these objects
		System.out.println(str3.equals(eod1));  // reference comparison because there is no relationship between these objects
		
	}

}
