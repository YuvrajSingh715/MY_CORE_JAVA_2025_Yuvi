package logical_questions;

public class DuplicateElement {

	public static void main(String[] args) {

		int[] arr = { 3, 2, 4, 1, 5, 3, 2, 6 };

		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i + 1; j < arr.length; j++) {
			
				if (arr[i] == arr[j]) {
			
					System.out.println("Duplicate: " + arr[i]);
				
					break;
				
				}
			
			}
		
		}
	
	}

}
