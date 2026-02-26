package com.Google.ExceptionHandling;

public class ThrowDemoCase02 {
	
	public static void main(String[] args) {
		
		//scenario-1
//		System.out.println(123/0);
//		System.out.println("hiiii");    //reachable code statement
		
		//scenario-2
		throw new ArithmeticException("/by zero");
//		System.out.println("Hello");   //unreachable code statement
		
	}

}

//After throw statement we are not allow to write any statement directly otherwise we will get compiletime error saying "unreachable statement".