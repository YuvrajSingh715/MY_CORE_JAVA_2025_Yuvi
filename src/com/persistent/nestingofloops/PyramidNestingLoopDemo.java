package com.persistent.nestingofloops;

public class PyramidNestingLoopDemo {
	
	public static void main (String[] args) {
		
		for (int i = 1; i<=7;  i++) {        
			
			for (int s = 1; s <= 7-i; s++) {
				
			System.out.print(" ");
			}
			
			for (int j = 1; j<=i*2-1; j++) {
					
			System.out.print("^");
			}
		
			System.out.println();
		}
		
	}

}
