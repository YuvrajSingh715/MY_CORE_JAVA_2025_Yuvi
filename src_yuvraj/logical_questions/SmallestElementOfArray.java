package logical_questions;

public class SmallestElementOfArray {

	public static void main(String[] args) {
		
		int[] arr = {3,5,6,7,1,9};
		int min = arr[0];
		
		for(int num: arr) {
			if(num < min)
				min = num;
		}
		
		System.out.println("Smallest Element: " + min);
	}
	
}
