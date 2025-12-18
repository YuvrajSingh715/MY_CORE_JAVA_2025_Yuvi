package com.Google.oopsconcept.constructor;

public class RecursionHandling {
	
	public void printNumber(int a) {
		if(a < 26) {
			return;	
		}
		printNumber(a-1);
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		RecursionHandling rh = new RecursionHandling();
		rh.printNumber(32);
	}

}
