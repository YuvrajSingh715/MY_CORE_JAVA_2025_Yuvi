package com.meta.streamapi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test9 {

	public static void main(String[] args) {
		List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222,333,111);
		Set<Integer> uniqueElement = new HashSet();
		Set<Integer> duplicate = listOfIntegers.stream().filter(s -> !uniqueElement.add(s)).collect(Collectors.toSet());
		System.out.println(duplicate);

	}

}
