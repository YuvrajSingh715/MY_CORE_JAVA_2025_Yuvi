package logical_questions;

import java.util.Arrays;

public class ArraySquareSumByJava8 {

	public static void main(String[] args) {
		int[] a = new int[] { 3, 5, 7, 6, 8 };

		int sumOfSquares = Arrays.stream(a).map(y -> y * y).sum();

		System.out.println("sum of all arrays squares: " + sumOfSquares);

		// 9+25+49+36+64 = 183

	}

}
