package logical_questions;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurrenceAndNonRepeatingChar {

	public static void main(String[] args) {

		String name = "yuvraj singh kushwah";

		// Occurrence of all character with spaces
		Map<Character, Long> charCount = name.chars().mapToObj(x -> (char) x)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println("occurrence of all char with spaces: " + charCount);
		System.out.println(System.lineSeparator());

		// Occurrence of all character without spaces
		Map<Character, Long> charCount1 = name.chars().mapToObj(x -> (char) x).filter(x -> x != ' ')
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println("occurrence of all char without spaces: " + charCount1);
		System.out.println(System.lineSeparator());

		// Find s non-repeating character
		Character secondNonRepeatingCharacter = name.chars().mapToObj(x -> (char) x).filter(x -> charCount.get(x) == 1).skip(1)
				.findFirst().orElse(null);

		System.out.println("second non-repeating char: " + secondNonRepeatingCharacter);
		System.out.println(System.lineSeparator());

		// Find most repeating character
		Character mostOccerranceChar = charCount.entrySet().stream().max(Map.Entry.comparingByValue())
				.map(Map.Entry::getKey).orElse(null);

		System.out.println("most repeating char: " + mostOccerranceChar);

	}

}
