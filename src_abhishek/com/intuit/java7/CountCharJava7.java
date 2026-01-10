package com.intuit.java7;

public class CountCharJava7 {

	public static void main(String[] args) {

		String s = "aabbbccccddddd";
		boolean[] visited = new boolean[s.length()];

		for (int i = 0; i < s.length(); i++) {

			if (visited[i]) {
				continue;
			}

			int count = 1;

			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
					visited[j] = true;
				}
			}

			System.out.println(s.charAt(i) + " = " + count);
		}
	}
}
