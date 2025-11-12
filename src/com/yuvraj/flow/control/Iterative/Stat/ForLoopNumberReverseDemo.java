package com.yuvraj.flow.control.Iterative.Stat;

public class ForLoopNumberReverseDemo {

	public static void main(String[] args) {

		int num = 8374;
		int temp = 0;
		int rev = 0;
		
		for (; num>0; ) {
			temp = num %10;     //to find the last digit
			rev = rev * 10 + temp;  
			num = num /10;      // to remove the last digit
		}
		
		System.out.println("The reverse number = "+rev);
	}

}
