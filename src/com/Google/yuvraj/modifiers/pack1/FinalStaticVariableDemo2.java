package com.Google.yuvraj.modifiers.pack1;

public class FinalStaticVariableDemo2 {
	
	final static int i;
	
	static  //it is working class loding time 
	{
		 System.out.println("Static block executed");
		 i = 10;  //initialization by static block
	}

	public static void main(String[] args) {
		System.out.println("main method executed");
		System.out.println( "value of i = "+i);
	}
}
