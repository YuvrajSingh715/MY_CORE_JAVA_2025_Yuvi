package com.intuit.loop;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		list.parallelStream().forEach(System.out::println);

	}

}
