package com.intuit.interview;

import java.util.Arrays;
import java.util.List;

public class SecondLowestAndOccurance {

	public static void main(String[] args) {
		List<Integer> newList = Arrays.asList(10, 10, 34, 45, 10, 9, 9, 10);
		// find second smallest number
		Integer secondLowest = newList.stream().distinct().sorted().skip(1).findFirst().orElse(null);
		System.out.println(secondLowest);
		// find occurrences of second smallest number
		Long secondNoOccurrence = newList.stream().filter(num -> num.equals(secondLowest)).count();
		System.out.println(secondNoOccurrence);
		
		 System.out.println("Second Smallest No.: " + secondLowest + " && Occurrence of Second No.: " + secondNoOccurrence);


	}

}
