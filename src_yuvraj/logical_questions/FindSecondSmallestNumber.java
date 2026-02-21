package logical_questions;

import java.util.Arrays;
import java.util.List;

// Write a java code to print 2nd lowest number and it's no of occurrences.  list= 10,10,34,45,10,9,9,10

public class FindSecondSmallestNumber {

	public static void main(String[] args) {

		List<Integer> newList = Arrays.asList(10, 10, 34, 45, 10, 9, 9, 10);

		// find second smallest number
		Integer secondNo = newList.stream().distinct().sorted().skip(1).findFirst().orElse(null);

		// find occurrences of second smallest number
		Long secondNoOccurrence = newList.stream().filter(n -> n.equals(secondNo)).count();

		System.out.println("Second Smallest No.: " + secondNo + " && Occurrence of Second No.: " + secondNoOccurrence);

	}

}
