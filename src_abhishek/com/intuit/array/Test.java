package com.intuit.array;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		  List<List<String>> list = Arrays.asList(
	                Arrays.asList("A", "B"),
	                Arrays.asList("C", "D"),
	                Arrays.asList("E")
	        );

	        List<String> result = list.stream()
	                .flatMap(Collection::stream)
	                .collect(Collectors.toList());

	        System.out.println(result);
	}

}
