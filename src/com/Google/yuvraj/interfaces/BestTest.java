package com.Google.yuvraj.interfaces;

public class BestTest {

	public static void main(String[] args) {

		Best plus = (a, b) -> System.out.println("Addition of a and b = " + (a + b));
		plus.add(34, 32);

//-----------------------This is Normal override process---------------------\\
//		@Override
//		public int add(int a, int b) {
//			return (a + b);
//		}	

//	    BestTest bt = new BestTest();
//	    bt.add(5,9);   //❌
//	    System.out.println(bt.add(23, 27));   //✔

	}
}
