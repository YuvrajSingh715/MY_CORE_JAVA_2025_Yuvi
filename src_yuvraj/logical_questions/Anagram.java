package logical_questions;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";
		System.out.println("Check both string is anagram or not :> "+anagrams(s1, s2));
	}

	static boolean anagrams(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		}

		int[] charCount = new int[100];

		for (int i = 0; i < s1.length(); i++) {
			charCount[s1.charAt(i)]++;
			charCount[s2.charAt(i)]--;
		}

		for (int count : charCount) {
			if (count != 0) {
				return false;
			}
		}

		return true;
		
	}

}
