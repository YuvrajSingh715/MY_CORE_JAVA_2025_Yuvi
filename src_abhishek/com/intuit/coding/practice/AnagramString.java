package com.intuit.coding.practice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramString {

	public static void main(String[] args) {
		String s1 = "Heart";
		String s2 = "Earth";
 List<String> list1	= Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.toList());
 List<String> list2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect((Collectors.toList()));
 
 if(list1.equals(list2)) {
	 System.out.println("Anagram");
 }else {
	 System.out.println("Not Anagram");
 }

	}

}
