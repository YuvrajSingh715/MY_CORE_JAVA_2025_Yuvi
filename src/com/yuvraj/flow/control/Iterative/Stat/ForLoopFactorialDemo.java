package com.yuvraj.flow.control.Iterative.Stat;

public class ForLoopFactorialDemo {

	public static void main(String[] args) {

		int i = 4;
		int fact = 1;

		for (; i > 1; i--)  //i have created the initialisation part before the for loop so that's why i skiped the initialisation inside the for loop 
			fact = fact * i;
  
		System.out.println("Factorial value = " +fact);
	}

}
