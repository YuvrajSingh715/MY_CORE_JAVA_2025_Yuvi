package com.Google.yuvraj.nestingofloops;

public class SortedArrayDemo {

	public static void main(String[] args) {

		int[] num = { 5, 3, 6, 2, 7, 1, 4, 8 };
		int temp = 0;

		for (int i = 0; i < num.length; i++) {

			for (int j = i + 1; j < num.length; j++) {

				if (num[i] > num[j]) {

					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.print("Sorted Array in ascending order = " );
		for (int i = 0; i < num.length; i++)
			System.out.print( num[i] + " ");
	}

}
