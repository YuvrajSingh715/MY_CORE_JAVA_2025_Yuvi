package com.yuvraj.flow.control.Iterative.Stat;

public class WhileLoopIterateArrayIndexDemo {

	public static void main(String[] args) {

		String [] n = {"Yuvraj", "Bhupesh", "Mahesh", "Deepak", "Raj", "Satyam", "Sunny"} ;
		
		int l = n.length;
		int i = 0;
		
		while (i<l) {
			System.out.println("Name = " + n[i]);
			i++;
		}
	}
}
