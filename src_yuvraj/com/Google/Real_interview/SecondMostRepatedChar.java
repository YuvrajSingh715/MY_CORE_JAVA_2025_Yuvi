package com.Google.Real_interview;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondMostRepatedChar {

	public static void main(String[] args) {

		String s = "Yuvraj Singh Kushwah";
		
		String s1 = s.replace(" ", "");
		
		Map <Character,Long> charCount = s1.chars().mapToObj(x -> (char) x).collect(Collectors.
				groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(charCount);
		
	}

}
