package logical_questions;

public class MaxOccurringChar {

	public static void main(String[] args) {

		String s = "success";
		char maxChar = ' ';
		int max = 0;

		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j))
					count++;
			}

			if (count > max) {
				max = count;
				maxChar = s.charAt(i);
			}
		}
		
		System.out.println("Max occurring char: " + maxChar);
	}
}
