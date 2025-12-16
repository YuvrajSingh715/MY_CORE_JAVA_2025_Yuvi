package com.intuit.array;

public class Array3D {

	public static void main(String[] args) {
		int[][][] arr = { { { 23, 34 }, { 45, 67 } }, { { 34, 56 }, { 56, 77 } } };
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				for(int k = 0; k<arr[i][j].length; k++) {
					System.out.println(arr[i][j][k] + " ");
				}
				System.out.println();
			}
			  System.out.println("----");
		}

	}

}
