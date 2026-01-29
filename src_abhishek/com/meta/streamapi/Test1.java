package com.meta.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Abhishek","Shiva","Darshan","Anand","Jyoti","Shiva","Anand");
		Map<Integer, List<String>> stringLength = list.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(stringLength);
		list.stream().distinct().forEach(System.out::println);

	}

}
