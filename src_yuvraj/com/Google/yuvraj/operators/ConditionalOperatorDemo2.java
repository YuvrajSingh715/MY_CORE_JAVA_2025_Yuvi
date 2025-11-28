package com.Google.yuvraj.operators;

public class ConditionalOperatorDemo2 {

	public static void main(String[] args) {

		int a = 45;
		int b = 51;
        //two conditional scenario
		int x1 = (a < 50) ? 500 : ((b < 50) ? 345 : 652); // here second conditional operator will not be executed because first condition is true
															
		int x2 = (b > 52) ? 200 : ((a > 44) ? 911 : 432); // here second conditional operator will be executed because first condition is false
															 
		int x3 = (a > 50) ? 300 : ((b < 50) ? 643 : 543); // here second conditional operator will be executed because first condition is false
		
		System.out.println("Two conditional operator scenario");
		System.out.println("final value of x1 = " + x1); // 500
		System.out.println("final value of x2 = " + x2); // 911
		System.out.println("final value of x3 = " + x3); // 543
		
		
		
		//three conditional scenario
		int y1 = (a < 50) ? 100 : ((b < 50) ? ((a>34) ? 61:47) : 432);
		//here second and third conditional operator will not be executed because first condition is true 
		
		int y2 = (b > 52) ? 200 : ((a < 35) ? ((b>34) ? 32:51) : 253);
		//here only second not third conditional operator will be execute because first condition is false
		
		int y3 = (a > 47) ? 300 : ((b > 61) ? ((a<34) ? 76:62) : 644);
		//here third conditional operator will not be execute because second condition is false
		
		int y4 = (b > 55) ? 400 : ((a < 69) ? ((b>34) ? 24:85) : 236);
		//here second and third both conditional operator will be execute because second condition is true
		
		int y5 = (b > 55) ? 400 : ((a < 69) ? ((a>78) ? 24:85) : 236);
		//here second and third both conditional operator will be execute
		
		System.out.println("Three conditional operator scenario");
		System.out.println("final value of y1 = " + y1); //100
		System.out.println("final value of y2 = " + y2); //253
		System.out.println("final value of y3 = " + y3); //644
		System.out.println("final value of y4 = " + y4); //24
		System.out.println("final value of y5 = " + y5); //85
		
	}

}
