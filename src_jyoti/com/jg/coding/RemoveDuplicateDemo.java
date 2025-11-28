package com.jg.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateDemo {

	public static void main(String[] args) {
		List<Integer> listOfIntegers = Arrays.asList(2,5,6,7,88,88,5,2,3,9);
		List<Integer> uniqueInteger = listOfIntegers.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueInteger);
	}

}
