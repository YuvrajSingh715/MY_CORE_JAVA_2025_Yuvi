package com.yuvraj.flow.control.selection.Stat;

public class SwitchDemo3 {
	
	public static void main(String[] args) {
		
		int x = 5;  //x=0 (W,R,Y,B) | x=1 (R,Y,B) | x=2 (Y,B) | x=3 (B) | x=4 (G) | x=5 (W,R,Y,B)
		
		switch(x) {
		
		default:
			System.out.println("White");
		case 1:
			System.out.println("Red");
		case 1+1:
			System.out.println("Yellow");
		case 1+1+1:
			System.out.println("Blue");
		    break;
		case 1+1+1+1:
			System.out.println("Green");
			
		}
	}

}
 