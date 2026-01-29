package com.meta.streamapi;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test4 {

	public static void main(String[] args) {

		String str = "Abhishek Singh Kushwah";
		String reversedStr = Arrays.stream(str.split(" ")).map(word -> new StringBuffer(word).reverse())
				.collect(Collectors.joining(" "));
		System.out.println(reversedStr);
		int num = IntStream.range(1, 11).sum();
		System.out.println(num);
		int[] array = new int[] { 5, 1, 7, 3, 9, 6 };
		int[] reversedArray = IntStream.rangeClosed(1, array.length).map(s -> array[array.length - s]).toArray();
		System.out.println(Arrays.toString(reversedArray));
		IntStream.range(1, 50).filter(s -> s % 2 == 0).forEach(System.out::println);
	
	
	
	}

}
