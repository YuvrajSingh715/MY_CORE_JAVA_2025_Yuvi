package logical_questions;

public class WordCountingInString {
	
	public static void main(String[] args) {
		
		String sentence = "This is your choice So tell me. what we have to do next step of this process?";
		int size = sentence.length();
		int countWord = 1;
		
		
		for(int i = 0; i<size - 1; i++) {
			if((sentence.charAt(i) == ' ') && (sentence.charAt(i+1) != ' ')) {
				countWord++;
			}
		}
			System.out.println("Word Counting: "+ countWord+ " words");
	}
}
