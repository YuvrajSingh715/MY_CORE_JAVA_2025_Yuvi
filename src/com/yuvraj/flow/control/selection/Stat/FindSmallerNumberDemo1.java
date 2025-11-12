package com.yuvraj.flow.control.selection.Stat;

public class FindSmallerNumberDemo1 {

	public static void main(String[] args) {

		int x = 6;
		int y = 5;
		int z = 3;
		int smaller;

		if (y < x) {
			smaller = y;
		} else {
			smaller = x;
		}
		if (z < smaller) {
			smaller = z;
		} 
		
		System.out.println("the smaller number is " + smaller);
	}
}
