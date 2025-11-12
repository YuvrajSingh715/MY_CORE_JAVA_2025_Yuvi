package com.yuvraj.varialbes;

public class Method_ex4 {
	    
	public static int digit(int a) {
	        
	        return a;
	    }
	
	public static int square(int a) {
        
        return a*a;
    }
	
	public static int cube(int a) {
        
        return a*a*a;
    }

	    public static void main(String[] args) {
	        
	        int digit = Method_ex4.digit(5);
	        int square = Method_ex4.square(digit);
	        int cube = Method_ex4.cube(digit);
	        
	        System.out.println("Digit = " + digit);
	        System.out.println("Square = " + square);
	        System.out.println("Cube = " + cube);
	        
	    }

}
