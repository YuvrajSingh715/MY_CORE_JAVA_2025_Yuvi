package com.persistent.flow.control.Iterative.Stat;

public class DoWhileLoopIterateArrayIndexDemo {

	public static void main(String[] args) {

		char[] c = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };

		int l = c.length;
		int i = 0;

		do {
			System.out.println("Character = " + c[i]);
			i++;
		
		} while (i < l);
	
	}

}
