package com.Google.InnerClass;

public class StaticInnerCls3 {
	
	int i = 11;
	static String s = "JonSnow";
	
	static class NestedCls {
		
		public void m1() {
//			System.out.println("Value of i: " + s.i);
			System.out.println("Value of s: " + s);
		}
	}
	
	public static void main(String[] args) {
		
		StaticInnerCls3.NestedCls sn = new StaticInnerCls3.NestedCls();
		
		sn.m1();
		
	}

}
