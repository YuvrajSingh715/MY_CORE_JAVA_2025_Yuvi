package logical_questions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckWiproWord {

	public static void main(String[] args) {

		String input = "I work at wipro";

		boolean result = containsWipro(input);

		System.out.println("input contains the wipro: " + result);
	}

	public static boolean containsWipro(String str) {

		// Regex pattern with word boundary
		Pattern pattern = Pattern.compile("\\bwipro\\b");
		Matcher matcher = pattern.matcher(str);
		return matcher.find();

	}
}
