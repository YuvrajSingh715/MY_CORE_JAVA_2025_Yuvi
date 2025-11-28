package com.Google.yuvraj.Real_Interview_codes;

public class StringPermutation {

	public static void main(String[] args) {

		String str = "Yuvi";
		permute(str, "");
	}

	public static void permute(String str, String ans) {

		// if the string is empty, print the answer
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}

		// Recur for all characters
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

		// remaining string
			String ros = str.substring(0, i) + str.substring(i + 1);

		// Recursive call
			permute(ros, ans + ch);
			
	
		}
	}
}
