package com.Google.yuvraj.flow.control.Iterative.Stat;

public class WhileLoopNumberReverseDemo {
	
	public static void main(String[] args) {
		
		int num = 1234567;
		int rev = 0;
		int temp = 1;
		
		while(num>0) {
			temp = num%10;
			rev = rev*10 + temp ;
			num = num/10;
		}
		System.out.println("The reverse number is = " +rev);
	}

}
