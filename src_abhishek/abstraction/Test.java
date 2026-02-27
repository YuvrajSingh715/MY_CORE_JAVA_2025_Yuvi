package abstraction;

import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		List<String> listOfString = Arrays.asList("Apple", "Kiwi", "Banana", "Kiwi", "Apple", "Grapes", "Banana",
				"Apple");
		Map<String, Long> stringCount = listOfString.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(stringCount);
		String fisrtReString = listOfString.stream().filter(str -> stringCount.get(str) > 1).findFirst().orElse(null);
		System.out.println(fisrtReString);

		String mostFrequent = stringCount.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey)
				.orElse(null);
		System.out.println(mostFrequent);

	}
}
