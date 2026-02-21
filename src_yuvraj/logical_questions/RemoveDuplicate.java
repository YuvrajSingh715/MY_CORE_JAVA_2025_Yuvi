package logical_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {

		List<String> stringList = Arrays.asList("cat", "dog", "cow", "dog", "goat");

		List<String> uniqueList = stringList.stream().distinct().collect(Collectors.toList());
		
		System.out.println(uniqueList);

	}
	
}
