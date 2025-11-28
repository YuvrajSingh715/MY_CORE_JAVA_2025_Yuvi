package com.Google.yuvraj.flow.control.Iterative.Stat;

public class DoWhileLoopNumberReverseDemo {

	public static void main(String[] args) {

		int num = 19834;
		int temp = 0;
		int rev = 0;
		
		do {
			temp = num % 10;
			rev = rev*10 + temp;
			num = num/10;
		}while (num > 0);
		System.out.println("the reverse number is = " +rev);
	}

}
