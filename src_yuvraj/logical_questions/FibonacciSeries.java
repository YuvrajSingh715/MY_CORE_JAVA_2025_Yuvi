package logical_questions;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 7; // number of terms
		int firstDigit = 0;
		int secondDigit = 1;

		System.out.print(firstDigit + " " + secondDigit + " ");

		for (int i = 2; i < n; i++) {
			int thirdDigit = firstDigit + secondDigit;
			System.out.print(thirdDigit + " ");
			firstDigit = secondDigit;
			secondDigit = thirdDigit;
		}
	}

}
