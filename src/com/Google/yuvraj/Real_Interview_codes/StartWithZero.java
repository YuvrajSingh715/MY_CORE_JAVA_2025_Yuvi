package com.Google.yuvraj.Real_Interview_codes;

import java.util.Arrays;

public class StartWithZero {

	public static void main(String[] args) {

		int[] arr = {1,3,0,5,0,2,6,0,2,9};
		int[] result = new int[arr.length];
		
		int index = 0;
		
		//first put all zeros
		for(int value : arr) {
			if(value == 0){
				result[index++]=0;
			}
		}
		
		//then put all non-zero elements
		for(int value : arr) {
			if(value != 0) {
				result[index++] = value;
			}
		}
        System.out.println(Arrays.toString(result));		
	}
}
