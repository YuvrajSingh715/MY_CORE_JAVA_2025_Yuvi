package com.yuvraj.flow.control.selection.Stat;

public class SwitchEnhancedExpressionDemo1 {
	
	public static void main(String[] args) {
		
		byte n = 6;
		
		String result = switch(n) {  //Without default case switch statement will give the error 
		
		case 1 -> "Hi Guys";
		case 2 -> "How are you ?";
		case 3 -> "How's going on ?";
		case 4,5 -> "i hope all is going well";
		case 6 -> { //you can only one time print yield inside the block
			int b = (n + 2);
			yield "The final value of x = " +b;  //here we can't use S.O.P Inside the block 
		}
		
		default -> "invalid";    // if you are print out like this than default case is mandatory
		
		};
		System.out.println(result); //without this line case will not print
	}

}
