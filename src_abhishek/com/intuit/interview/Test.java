package com.intuit.interview;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		//An anagram is formed by rearranging the letters of a word.
		 
	   String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		//Output: [["eat","tea","ate"],["tan","nat"],["bat"]]
	   
	   Stream<Object> str =Arrays.stream(strs).map(String::toUpperCase);
	   str.sorted().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

	   
			   
	}

}
