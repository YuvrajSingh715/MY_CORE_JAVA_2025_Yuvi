package com.Google.ExceptionHandling;

public class ThrowDemo {

	public static void main(String[] args) {
		
		System.out.println(343/0);
		
		throw new ClassCastException("return type does't matched properly...");
		
	}

}
