package logical_questions;

public class CountOddAndEvenNumber {
	
	public static void main(String[] args) {
		
		int[] array = {5, 3, 5, 6, 7, 1, 9, 2};
		int[] count = countOddEven(array);
		
		System.out.println("Even Number: " + count[1]);
		System.out.println("Odd Number: " + count[0]);
		
	}
	
	public static int[] countOddEven(int [] array) {
		int[] count = new int[2];
		for(int num : array) {
			if(num%2 == 0) {
				count[1]++;
			}else {
				count[0]++;
			}
		}
		return count;
	}
}
