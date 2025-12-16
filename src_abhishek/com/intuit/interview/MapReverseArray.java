package com.intuit.interview;

import java.util.stream.IntStream;

public class MapReverseArray {

	public static void main(String[] args) {
		int[] a = {12, 34, 56};
		String[] b = {"ram", "ravi", "sonu"};
		
		//Java 8 – Reverse height and print with name
		IntStream.range(0, a.length).boxed().sorted((i , j) -> Integer.compare(a[j], a[i])) //reverse
		.forEach(i ->System.out.println(b[i] + " : " + a[i]));

	}

}
