package logical_questions;

import java.util.Arrays;

public class MedianArray {
	
	public static void main(String[] args) {

		int[] arr = {4,1,6,3,8};
		Arrays.sort(arr);  //1,3,4,6,8

			int mid = arr.length/2;
			
			System.out.println("Median: " + arr[mid]);
	
	}
	
}
