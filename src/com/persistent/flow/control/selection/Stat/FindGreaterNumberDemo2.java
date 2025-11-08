package com.persistent.flow.control.selection.Stat;

public class FindGreaterNumberDemo2 {

	public static void main(String[] args) {

		int p = 11;
		int q = 22;
		int r = 33;
		int s = 44;

		if (p > r && p > s && p > q) {
			System.out.println("p is greater number");
			
		} else if (q > s && q > p && q > r) {
			System.out.println("q is greater number");
		
		} else if (r > p && r > s && r > q) {
			System.out.println("r is greater number");
		
		} else {
			System.out.println("s is greater number");
		}
		
	}
}
