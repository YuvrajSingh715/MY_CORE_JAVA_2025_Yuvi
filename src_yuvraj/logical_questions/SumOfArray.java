package logical_questions;

public class SumOfArray {

	public static void main(String[] args) {
		
		int[] array = {11,55,32,25,61};
		int sum = 0;
		
		for(int s : array) {
			sum = sum + s;
		}
		
		System.out.println("Sum of Array: " + sum);
		
	}
	
}
