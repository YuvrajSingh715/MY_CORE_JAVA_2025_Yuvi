package com.yuvraj.operators;

public class BitWiseOperatorDemo1 {

	public static void main(String[] args) {

		int x = 7;
		int y = 11;
        
		if (++x >= 8 & ++y <= 12) { //first is true and second is true
			++x; //If both results are true, then print this condition
		} 
		
		else {
			++y; //If one result is false, then print this condition
		}

	    System.out.println("x = " +x+ " And" +" y = "+y);

	    
	    
	    int a = 7;
		int b = 11;
		
		if (++a >= 8 & ++b <= 11) { //first is true and second is false
			++a; //If both results are true, then print this condition
		} 
		
		else {
			++b; //If one result is false, then print this condition
		}

	    System.out.println("a = " +a+ " And" +" b = "+b);
	}

}
