package com.yuvraj.operators;

public class ChainedAssignmentOperatorDemo {

	public static void main(String[] args) {

		int x , y , z; // Primitives copy the value
		x = y = z = 43; // 43 assigned [z → y → x] Because assignment operator [=] always works Right to Left
		
		System.out.println("value of x = " +x);
		System.out.println("value of y = " +y);
		System.out.println("value of z = " +z);
		
		String a , b , c; // strings copy the reference
		a = b = c = "Yuvraj Singh"; // Yuvraj Singh assigned [c → b → a] Because assignment operator [=] always works Right to Left
		System.out.println("value of a = " +a);
		System.out.println("value of b = " +b);
		System.out.println("value of c = " +c);
		
	}

}
