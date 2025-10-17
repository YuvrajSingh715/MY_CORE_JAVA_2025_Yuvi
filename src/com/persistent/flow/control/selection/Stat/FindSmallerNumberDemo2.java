package com.persistent.flow.control.selection.Stat;

public class FindSmallerNumberDemo2 {

	public static void main(String[] args) {
		
		int l = 1;
		int m = 2;
		int n = 3;
		int o = 4;

		if (l < m && l < n && l < o) {
			System.out.println("l is smaller");
			
		} else if (m < o && m < n && m < l) {
			System.out.println("m is smaller");
		
		} else if (o < n && o < m && o < l) {
			System.out.println("o is smaller");
		
		} else {
			System.out.println("n is smaller");
		}
		
	}
}
