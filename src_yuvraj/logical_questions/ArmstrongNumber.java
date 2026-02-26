package logical_questions;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int number = 153;
		int original = number;
		int sum = 0;

		// Count digits
		int digits = String.valueOf(number).length();

		while (number > 0) {

			int digit = number % 10; // get last digit
			sum += Math.pow(digit, digits); // raise to power
			number = number / 10; // remove last digit
		}

		if (sum == original) {
			System.out.println(original + " is an armstrong number.");
		} else {
			System.out.println(original + " is Not an armsstorm number.");
		}

	}

}
