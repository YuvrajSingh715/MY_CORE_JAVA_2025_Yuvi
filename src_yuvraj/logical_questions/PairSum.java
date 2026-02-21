package logical_questions;

public class PairSum {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 5, 6, 8, 9, 3 };
		int target = 11;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 0; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.println("Pair: " + "[" + arr[i] + " , " + arr[j] + "]");
				}
			}
		}
	}
}
