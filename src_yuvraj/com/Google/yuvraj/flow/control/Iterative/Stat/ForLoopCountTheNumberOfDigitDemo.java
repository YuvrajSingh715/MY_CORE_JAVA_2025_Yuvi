package com.Google.yuvraj.flow.control.Iterative.Stat;

public class ForLoopCountTheNumberOfDigitDemo {

	public static void main(String[] args) {

		int i = 1234890;
		int count;

		for (count = 0; i!= 0; count++) 
			i = i/10;
		
		
			System.out.println("total digit of number = " +count); // loop will be stoped than print this

	}

}
