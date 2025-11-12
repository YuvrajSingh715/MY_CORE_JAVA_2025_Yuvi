package com.yuvraj.operators;

public class BitWiseOperatorDemo3 {

	public static void main(String[] args) {
  
		int x = 10;
		int y = 20;
		
		if (++x >= 10 ^ ++y <= 20) { //first is true and second is false
			++x ; //if both results are different then print this condition
		}
		else { 
			++y ; // if both results are same then print this condition
		}
	
		System.out.println("x = " +x+ " And" +" y = "+y);
		
	
		
		int a = 10;
		int b = 20;
		
		if (++a >= 10 ^ ++b <= 21) { //first is true and second is true
			++a ; //if both results are different then print this condition
		}
		else { 
			++b ; // if both results are same then print this condition
		}
	
		System.out.println("a = " +a+ " And" +" b = "+b);
	}

}
