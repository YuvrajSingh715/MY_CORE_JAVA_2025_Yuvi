package com.Google.yuvraj.flow.control.Iterative.Stat;

public class WhileLoopFactorialDemo {
	
	public static void main(String[] args) {
		
		int i = 4;
		int fact = 1;
		
		while (i > 1) {
			fact = fact*i;   //fact=1*4, fact=4*3
			i--;            //i=4 , i=3
		}
		System.out.println(fact);
	}
                  
}