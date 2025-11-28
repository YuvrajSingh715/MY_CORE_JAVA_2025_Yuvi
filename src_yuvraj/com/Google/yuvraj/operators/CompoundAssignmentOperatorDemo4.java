package com.Google.yuvraj.operators;

public class CompoundAssignmentOperatorDemo4 {

	public static void main(String[] args) {

	    int w, x, y, z;
	    
	    // first scenario
		w = x = y = z = 100;  // here 100 assigned [z → y → x →w] Because assignment operator [=] always works Right to Left
		System.out.println("---first scenario---");
		System.out.println("value of w = " + w); //w = 100
		System.out.println("value of x = " + x); //x = 100
		System.out.println("value of y = " + y); //y = 100
		System.out.println("value of z = " + z); //z = 100
		
		
		
		//second scenario
		w += x *= y += z /= 2; // Behind this scenario this process is following
		/*
		w += x *= y += z /= 2; | z = z/2 = 100/2 → 50 | z=50
		w += x *= y += z; | y = y+z = 100+50 → 150 | y=150
		w += x *= y; | x = x*y = 100*150 → 15000 | x=15000
		w += x; | w = w+x = 100+15000 → 15100 | w=15100 
		*/
		System.out.println("---second scenario---");
		System.out.println("value of w = " + w); //w = 15100
		System.out.println("value of x = " + x); //x = 15000
		System.out.println("value of y = " + y); //y = 150
		System.out.println("value of z = " + z); //z = 50
		
		
		
	}

}
