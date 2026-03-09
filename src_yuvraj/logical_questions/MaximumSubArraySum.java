package logical_questions;

public class MaximumSubArraySum {
	
	public static void main(String[] args) {
		
		int[] arr = {-3,4,-5,-1};
		
		int maxSum = arr[0];
		int currentSum = arr[0];
		
		for(int i = 1; i<arr.length; i++) {
			currentSum = Math.max(arr[i], currentSum + arr[i]);
			maxSum = Math.max(maxSum, currentSum);
		}
		
		System.out.println("Maximum subarray sum: " + maxSum);
		
	}

}
