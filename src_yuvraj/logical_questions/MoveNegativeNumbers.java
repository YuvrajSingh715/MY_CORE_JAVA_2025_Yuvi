package logical_questions;

public class MoveNegativeNumbers {

	public static void main(String[] args) {
		
		int[] arr = {2,-5,6,3,-7,-1};
		int j = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] < 0) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j++;
			}
		}
		
		for(int num : arr) {
			System.out.print(num + ", ");
		}
	}
	
}
