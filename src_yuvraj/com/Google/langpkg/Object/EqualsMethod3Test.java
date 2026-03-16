package com.Google.langpkg.Object;

public class EqualsMethod3Test {
	
	public static void main(String[] args) {
		
		EqualsMethod3 em1 = new EqualsMethod3(001,"jack");
		EqualsMethod3 em2 = new EqualsMethod3(001,"jack");
		
		System.out.println(em1 == em2);  //false
//		System.out.println(em1.equals(em2));  //false -> without override the equals(). then it will compare referance as a == operator.
		System.out.println(em1.equals(em2));  //true -> if we override the equals(). then it will compare content comparison.
		
		
		EqualsMethod3 em3 = null;
		System.out.println(em1.equals(em3));
		System.out.println(em3.equals(em1));  //if we call any method through the null at that time we will get NullPointerException.
		
	}

}
