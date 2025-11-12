package com.yuvraj.flow.control.selection.Stat;

public class FindSmallerNumberDemo {

	public static void main(String[] args) {

		int x = 12;
		int y = 22;
		int z = 31;

		if (x < y && x < z) {
			System.out.println("x is smaller");
			
		} else if (y < x && y < z) {
			System.out.println("y is smaller");
			
		} else {
			System.out.println("z is smaller");
		}
		
	}
}
