package logical_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AverageOfList {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

		Double average = list.stream().collect(Collectors.averagingInt(Integer::intValue));

		System.out.println("Average of Integer List: " + average);

	}

}
