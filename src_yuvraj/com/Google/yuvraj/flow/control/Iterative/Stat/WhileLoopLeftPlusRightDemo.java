package com.Google.yuvraj.flow.control.Iterative.Stat;

public class WhileLoopLeftPlusRightDemo {

	public static void main(String[] args) {

		int num = ***REMOVED***67; // Original number
		int temp = num; // Temporary variable to manipulate
		int digit = 0; // Total number of digits

		// Step 1: Count total digits
		while (temp != 0) {
			temp = temp / 10;
			digit++;
		}

//		System.out.println("Total digits = " + digit);

		temp = num; // Reset temp to original number

		// Step 2: Loop to add leftmost and rightmost digits 
		while (temp > 0) {

			// Get leftside digit
			int left = temp / (int) Math.pow(10, digit - 1);

			// Get rightside digit
			int right = temp % 10;

			// Print their sum
			int sum = left + right;
			System.out.println(left + " + " + right + " = " + sum);

			// Remove leftside digit
			temp = temp % (int) Math.pow(10, digit - 1);

			// Remove rightside digit
			temp = temp / 10;

			// Reduce digit count by 2 (since we removed both digits)
			digit -= 2;
		}
	}
}
