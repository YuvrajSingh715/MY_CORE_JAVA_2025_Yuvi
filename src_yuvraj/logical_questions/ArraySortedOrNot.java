package logical_questions;

public class ArraySortedOrNot {
	
	public static void main(String[] args) {
		
		int[] a = {1, 2, 3, 4, 5, 6};
		boolean sorted = true;
		
		for(int i= 0 ; i<a.length-1; i++) {
			if(a[i]>a[i+1]) {
				sorted = false;
				break;
			}
		}
		
		System.out.println(sorted ? "Sorted Array" : "Not Sorted Array");
	}

}
