package com.intuit.array;

import java.util.HashMap;
import java.util.Map;

public class OccuranceNumber {

	public static void main(String[] args) {
		int [] arr = {12,34,56,78,34,12};
		Map<Integer, Integer> map = new HashMap<>();
		for(int num : arr) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
          System.out.println(map);
	}

}
