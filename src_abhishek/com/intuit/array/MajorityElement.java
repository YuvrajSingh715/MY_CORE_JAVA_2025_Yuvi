package com.intuit.array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		int[] arr = { 12, 34, 56, 78, 90, 34, 12 };
		Map<Integer, Integer> map = new HashMap<>();
		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			if (e.getValue() > arr.length / 2) {
				System.out.println(e.getKey());
			}
		}
	}

}
