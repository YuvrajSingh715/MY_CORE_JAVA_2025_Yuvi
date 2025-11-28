package com.Google.yuvraj.modifiers.pack1;

public class FinalLocalVariableDemo2 {
	
	public static void main(String[] args) {
		m1(12, 132); //this is actual perameter
		
	}
	
	public static void m1(final int x , int y) {
		
//	 	x = 12;  //we can't declare the value of x becuase it is final
//		y = 143;
	
		System.out.println(x +" , "+y);
	}

}
