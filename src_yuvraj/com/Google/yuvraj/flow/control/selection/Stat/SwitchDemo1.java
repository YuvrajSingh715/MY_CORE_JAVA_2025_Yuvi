package com.Google.yuvraj.flow.control.selection.Stat;

public class SwitchDemo1 {
	
	public static void main(String[] args) {
		
		int A = 11;
		final int B = 21;   //we can directly use 'B' as a case label 
		
		switch (A) {
		
		case 11 :
			System.out.println("Case label should be a constant number");
		case B :
			System.out.println("A case label is only considered a constant");
			System.out.println("when we make the variable 'B' a constant by using the final keyword");
			System.out.println("Then we can use it in the switch statement");
					
		}
	}

}
