package com.Google.InnerClass;

//Type- Normal or Regular Inner calsses.

public class OuterDemo3Test {

	public static void main(String[] args) {
		
		OuterDemo3 o3 = new OuterDemo3();
		
		OuterDemo3.Inner inner = o3.new Inner();
		
		inner.m3();
		
		
//		new OuterDemo3().new Inner().m3();
		
	}
}
