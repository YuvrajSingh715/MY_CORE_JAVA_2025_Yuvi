package com.persistent.flow.control.Iterative.Stat;

public class FibonacciSeriesDemo {

	public static void main(String[] args) {

		int firstNo = 0; // first Fibonacci number
		int secondNo = 1; // second Fibonacci number
//        int sum = 0;
        
		System.out.println("🔹Fibonacci Series:");                     
		
		for (int i = 1; i <= 13; i++) {                                
		System.out.print(firstNo + ", "); // print current number       
        
//		sum = sum + firstNo;
		int nextNo = firstNo + secondNo; // calculate next Fibonacci number  
		firstNo = secondNo; // move second to first                          
		secondNo = nextNo; // update second to next                          
		}
		System.out.println("..."); // end of series
//		System.out.println("🔹Sum of Fibonacci Series : " +sum);
	}

}  //Fibonacci Series : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 ...
