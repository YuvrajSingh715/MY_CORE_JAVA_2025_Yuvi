package com.Google.langpkg;

public class ToStringMethod2 {
	
	int a;
	String n;

	public ToStringMethod2(int a, String n) {
		this.a = a;
		this.n = n;
	}
	
	@Override
	public String toString() {
		return "value of a: " + a + " $$ value of n: " + n;
	}
	
	public static void main(String[] args) {
		
		ToStringMethod2 tsm = new ToStringMethod2(12,"Jon");
		
		Object obj = new ToStringMethod2(11, "Snow");
		
//		String s1 = tsm.toString();
//		String s2 = tsm + "";
//		String s3 = String.valueOf(tsm);
		
		System.out.println(tsm);
		System.out.println(tsm.toString());
		System.out.println(obj);
		
	}
	
}
