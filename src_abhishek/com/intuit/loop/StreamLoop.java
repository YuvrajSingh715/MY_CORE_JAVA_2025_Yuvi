package com.intuit.loop;

import java.util.Arrays;
import java.util.List;

public class StreamLoop {

	public static void main(String[] args) {
	List<Integer> list = Arrays.asList(1,2,3,4,5);
	list.forEach(n -> System.out.println(n));

	}

}
