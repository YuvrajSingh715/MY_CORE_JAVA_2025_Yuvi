package logical_questions;

import java.util.HashSet;

public class FindDuplicates {
	
	public static void main(String[] args) {
		
		int[] arr = {2, 4, 6, 2, 6, 3, 7, 5};
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int num : arr) {
			if(!set.add(num)) {
				System.out.println("Duplicate: " + num);
			}

		}

	}

}
