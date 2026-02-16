package com.Google.Enum;

public class AlphabetTest {
	
	public static void main(String[] args) {
		
		Alphabet a = Alphabet.UU;
		
		switch(a) {
		
		case AA:
			System.out.println("AA - It is a Vowel Characters.");
			break;
		case SS:
			System.out.println("SS - It is a Consunant Characters.");
			break;
		case UU:
			System.out.println("UU - It is a Vowel Characters.");
			break;
		case OO:
			System.out.println("OO - It is a Vowel Characters.");
			break;
		case JJ:
			System.out.println("JJ - It is a Consunant Characters");
			break;
		default:
			System.out.println("Out of range characters. you are seaching.");
			
		}
		
	}

}
