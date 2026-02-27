package com.intuit.interview;

public class ArraySquareSum3 {

	public static void main(String[] args) {
		int [] a = new int[] {3,4,6,7,8};
		
		int sum = 0;
		for(int i = 0; i<a.length; i++) {
			sum += a[i] * a[i]; 
		}
       System.out.println("Sum of squares = " +sum);
	}

}
