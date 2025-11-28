package com.Google.yuvraj.interfaces;

public class TopBottomTest implements Top,Bottom{

	public static void main(String[] args) {

//		System.out.println(x);     //we can't directly call variable a x becuase there is ambiguity issue.
		System.out.println("The value of x = " + Top.x);
		System.out.println("The value of x = " + Bottom.x);
	    
	}

}
