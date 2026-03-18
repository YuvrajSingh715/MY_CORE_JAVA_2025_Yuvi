package logical_questions;

import java.util.Arrays;

public class ArrayEquality {

	public static void main(String[] args) {

		int[] a = { 1, 3, 2, 4 };
		int[] b = { 4, 2, 1, 3 };
		int[] c = { 1, 3, 2, 4 };

		System.out.println("array a and b: "+Arrays.equals(a, b));
		System.out.println("array a and c: "+Arrays.equals(a, c));

	}

}
