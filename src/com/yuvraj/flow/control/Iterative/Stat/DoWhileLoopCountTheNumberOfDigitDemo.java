package com.yuvraj.flow.control.Iterative.Stat;

public class DoWhileLoopCountTheNumberOfDigitDemo {

	public static void main(String[] args) {

		int num = 79642934;
		int count = 0;
		
		do {
			num = num / 10;
			count++;
		}while (num !=0 );
		System.out.println("Total digit inside the number = " +count);
			
	}

}
