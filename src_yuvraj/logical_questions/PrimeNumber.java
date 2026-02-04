package logical_questions;

public class PrimeNumber {

	public static void main(String[] args) {

		int digit = 5;
		int count = 0;

		for (int i = 1; i <= digit; i++) {
			if (digit % i == 0)
				count++;
		}

		if (count == 2) {
			System.out.println("This is a prime number.");
		} else {
			System.out.println("This is a composite number.");
		}
	}

}
