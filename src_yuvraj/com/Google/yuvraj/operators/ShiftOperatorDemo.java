package com.Google.yuvraj.operators;

public class ShiftOperatorDemo {
	
	public static void main(String[] args) {
		
		int x = 20;
		
		int a = x << 0;  //Left shift mean number multiply by 2 
		int b = x >> 1;  //Right shift mean number divided by 2 
		int c = x >>> 2; //Unsigned right shift mean number divided by 2 but no negative sign 
	 
	   System.out.println("value of a = " +a);
	   System.out.println("value of b = " +b);
	   System.out.println("value of c = " +c);
	}

}
