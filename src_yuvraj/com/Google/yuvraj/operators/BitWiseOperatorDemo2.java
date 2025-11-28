package com.Google.yuvraj.operators;

public class BitWiseOperatorDemo2 {

	public static void main(String[] args) {

		int x = 5;
		int y = 10;

		if (--x >= 3 | --y <= 8) { //first is true and second is false
			--x; //if at least one result is true then print this condition
		} 
		
		else {
			--y; //if both results are false then print this condition
		}
	 
		System.out.println("x = " +x+ " And" + " y = " +y);
	
		
		
		int a = 5;
		int b = 10;
		
		if (--a >= 5 | --b <= 8) { //first is false and second is false
			--a; //if at least one result is true then print this condition
		}
		
		else {
			--b; //if both results are false then print this condition
		}
	
		System.out.println("a = " +a+ " And" + " b = " +b);
	}

}
