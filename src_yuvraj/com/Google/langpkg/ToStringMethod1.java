package com.Google.langpkg;

//ToString() -> it converts class object into string.

public class ToStringMethod1 {

	public static void main(String[] args) {

		ToStringMethod1 tsm = new ToStringMethod1();

		System.out.println(tsm);
		System.out.println(tsm.toString());
		System.out.println(System.lineSeparator());

//		Ways of convert the java object to string;

		String s1 = tsm.toString();
		String s2 = tsm + "";
		String s3 = String.valueOf(tsm);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}

}
