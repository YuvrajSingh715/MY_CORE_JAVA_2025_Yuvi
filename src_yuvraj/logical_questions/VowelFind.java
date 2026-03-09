package logical_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VowelFind {

	public static void main(String[] args) {

		List<String> listOfString = Arrays.asList("aab", "xyz", "iiu");

		List<Character> vowels = new ArrayList<>();

		for (String str : listOfString) {

			for (char cha : str.toCharArray()) {

				if ("aeiou".indexOf(cha) != -1) {

					vowels.add(cha);
				}
			}
		}

		System.out.println("vowels :" + vowels);

	}
}
