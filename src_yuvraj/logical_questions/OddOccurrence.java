package logical_questions;

public class OddOccurrence {

	public static void main(String[] agrs) {

		int[] arr = { 2, 3, 5, 2, 3, 6 };
		int result = 0;
		
		for(int num:arr) {
			result ^= num;
		}
		
		System.out.println("Odd Occurring element: " + result);

	}

}
