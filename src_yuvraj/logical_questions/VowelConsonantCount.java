package logical_questions;

public class VowelConsonantCount {

	public static void main(String[] args) {
		String s = "Failure will never overtake me if my determination succeed is strong enough.";
		counting(s);
	}

	static void counting(String str) {

		int vowels = 0; 
		int consonants = 0;
		
		str = str.toLowerCase();

		for (char c : str.toCharArray()) {
			if (c >= 'a' && c <= 'z') {
				if (c == 'a' || c  == 'e' || c == 'i' || c == 'o' || c == 'u')
					vowels++;

			} else {
				consonants++;
			}
		}
		
		System.out.println("Vowels : " + vowels);
		System.out.println("Consonants : " + consonants);
	}
}
