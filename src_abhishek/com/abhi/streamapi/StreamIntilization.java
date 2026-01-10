package com.abhi.streamapi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntilization {

	public static void main(String[] args) {
		// From Collection Object
		List<String> values = List.of("One", "Two", "Three");
		Stream<String> stream1 = values.stream();
		stream1.forEach(System.out::println);
		//stream1.forEach(System.out::println); // IllegalStateException
		System.out.println(values.stream().collect(Collectors.toList()));
		

	}

}
