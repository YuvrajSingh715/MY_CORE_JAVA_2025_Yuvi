package com.intuit.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FalatMap_Map {

	public static void main(String[] args) {
		List<List<String>> list = Arrays.asList(Arrays.asList("A", "B"), Arrays.asList("C", "D"));
		// map -> gives Stream<List<String>>
		list.stream().map(x -> x.stream()).forEach(System.out::println);
		System.out.println("------------------------------------");

		// flatmap -> gives Stream<String>
		list.stream().flatMap(x -> x.stream()).forEach(System.out::println);

	}

}
