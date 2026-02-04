package logical_questions;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		
		int num = scan.nextInt();
		
		if(num %2 != 0) {
			System.out.println("The give number is ODD");
		}else {
			System.out.println("The give number is EVEN");
		}
		
	}

}
