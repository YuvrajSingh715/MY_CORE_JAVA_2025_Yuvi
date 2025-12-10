package com.Google.yuvraj.Real_interview;

public class DuplicateDemo1 {

	// Only Applicable For Double Number 
	
	public static void main(String[] args) {

		int[] num = { 3, 5, 2, 6, 4, 2, 4, 6};

		for (int i = 0; i < num.length; i++) {

			for (int j = i + 1; j < num.length; j++) {

				if (num[i] == num[j]) {

					System.out.println("duplicates number = " + num[i]);
				}
			}
		}

	}

}