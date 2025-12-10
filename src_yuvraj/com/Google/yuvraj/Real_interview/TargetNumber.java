package com.Google.yuvraj.Real_interview;

public class TargetNumber {
	
	public static void main(String[] args) {
	
		int[] nums = { 2, 15, 11, 7 };
		int target = 9;

		for (int i = 0; i < nums.length; i++) {
		
			for (int j = i + 1; j < nums.length; j++) {
			
				if (nums[i] + nums[j] == target) {
				
					System.out.println("index number = " + "[" + i + ", " + j + "]");
				}
			}
		}
	}
}

