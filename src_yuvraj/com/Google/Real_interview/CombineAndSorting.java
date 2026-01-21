package com.Google.Real_interview;

import java.util.Arrays;
import java.util.Comparator;

//Given List<List<Integers>> listOfLists , You have to combine and sort the elements in descending order

public class CombineAndSorting {

	public static void main(String[] args) {
		
		Integer[][] arr = {
		        {12, 343, 56},
		        {34, 454, 6, 4, 5},
		        {45, 99}
		};
		
		int[][] arr1 = {
				{12, 343, 56},
				{34, 454, 6, 4, 5},
				{45, 99}
		};
		
		Integer[] flatSorted = Arrays.stream(arr)
		        .flatMap(Arrays::stream)
		        .sorted(Comparator.reverseOrder())
		        .toArray(Integer[]::new);

		System.out.println(Arrays.toString(flatSorted));

		
		int[] flatSorted1 = Arrays.stream(arr1)      // IntStream of int[]
		        .flatMapToInt(Arrays::stream)        // flatten
		        .sorted()                            // sort
		        .toArray();                          // convert to array

		System.out.println(Arrays.toString(flatSorted1));
		
//		List<Integer> shortedList = Arrays.stream(arr).flatMap(Arrays::stream).sorted
//				(Comparator.reverseOrder()).collect(Collectors.toList());
//		
//		System.out.println("Shorted List: "+shortedList);
	}

}
