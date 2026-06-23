package com.intuit.interview;

public class CommonLongestStringPrefix {

	public static void main(String[] args) {
		String[] words1 = {"flower", "flow", "flight"};
		
		String prefix = words1[0];
		for(int i = 1; i < words1.length; i++) {
			while(words1[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				
			}
		}
         System.out.println(prefix);
	}

}
