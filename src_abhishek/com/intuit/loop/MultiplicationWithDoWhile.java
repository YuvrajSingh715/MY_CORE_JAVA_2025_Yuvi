package com.intuit.loop;

public class MultiplicationWithDoWhile {

	public static void main(String[] args) {
		int num = 5;
		int i = 1;
		
		do {
			System.out.println(num + " X " + i + " = " + (num * i));
			i++;
		}while(i <= 10);

	}

}
