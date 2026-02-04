package logical_questions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrangeTheZeros {

	public static void main(String[] args) {

		int[] a = { 3, 5, 0, 4, 2, 7, 0, 6, 0, 5, 0, 0, 1 };

		int[] result = IntStream.concat(
				Arrays.stream(a).filter(x -> x != 0), 
				Arrays.stream(a).filter(x -> x == 0)
				).toArray();
		
		System.out.println("Final Output: "+Arrays.toString(result));
		
	}

}
