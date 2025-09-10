package com.persistent.variable;

public class WithoudVarArg {

	 public static void main(String[] args) {
	        
	        m1();
	        
	        m1(1);
	        
	        m1(1,2);
	        
	        m1(1,2,3);

	    }
	    
	    public static void m1() {
	        System.out.println("m1 with zero argument = 0" );
	    }
	    
	    
	    public static void m1(int a) {
	        
	        System.out.println("m1 with one argument = "+a);
	    }
	    
	    public static void m1(int a, int b) {
	        System.out.println("m1 with two argument = "+a +b);
	    }
	    
	    public static void m1(int a, int b, int c) {
	        System.out.println("m1 with three argument = "+a +b +c);
	    }
	
}
