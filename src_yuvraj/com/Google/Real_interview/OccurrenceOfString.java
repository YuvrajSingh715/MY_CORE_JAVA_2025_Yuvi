package com.Google.Real_interview;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfString {

	public static void main(String[] args) {

		String s = "Yuvraj";

		Map<Character, Integer> map = new HashMap<>();
		for (char c : s.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		
		System.out.println(map);
	}

}
