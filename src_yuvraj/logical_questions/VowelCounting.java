package logical_questions;

public class VowelCounting {

	public static void main(String[] args) {

		String str = "hello world, how is going on...";
		int count = 0;

		for (char c : str.toCharArray()) {
			if ("aeiou".indexOf(c) != -1)
				count++;
		}
		System.out.println("Frequency of vowels: " + count);
	}
}
