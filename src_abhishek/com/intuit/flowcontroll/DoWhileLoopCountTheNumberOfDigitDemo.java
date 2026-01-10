package com.intuit.flowcontroll;

public class DoWhileLoopCountTheNumberOfDigitDemo {

	public static void main(String[] args) {
		int num = 876589276;
	    int count = 0;
	    
	    do {
	      num  = num/10;
	      count++;
	    }while(num != 0);
		   System.out.println(count);
	    }


}
