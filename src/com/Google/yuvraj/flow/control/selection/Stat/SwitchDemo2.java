package com.Google.yuvraj.flow.control.selection.Stat;

public class SwitchDemo2 {
	
	public static void main(String[] args) {
		
		int x = 0;  //x=0 (E) | x=1 (A,B) | x=2 (B) | x=3 (C,D,E) | x=4 (D,E) | x=5 (E)
		
		switch (x) {
		
		case (0+1):
			System.out.println("A");
		case (1+1):
			System.out.println("B");
		    break;
		case (1+2):
			System.out.println("C");
		case (2+2):
			System.out.println("D");
		default:
			System.out.println("E");
		}
	
	}

}
