package com.intuit.array;

import java.util.Arrays;

public class RotateArrayLeft {

	public static void main(String[] args) {
		int [] arr = {12,34,56,67,89};
		int first = arr[0];
		for(int i = 0; i<arr.length-1; i++ ) {
			arr[i] = arr[i+1];
		}
        arr[arr.length-1] = first;
        System.out.println(Arrays.toString(arr));
	}
  
}
