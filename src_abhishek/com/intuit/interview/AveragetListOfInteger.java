package com.intuit.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AveragetListOfInteger {

	public static void main(String[] args) {
		List<Integer> listOfInteger = Arrays.asList(12,34,56,78,90);
	Double average = listOfInteger.stream().collect(Collectors.averagingInt(Integer::intValue));
	System.out.println(average);

	}

}
