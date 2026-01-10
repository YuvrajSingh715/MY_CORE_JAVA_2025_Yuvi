package com.Google.Real_interview;

public class RemoveDuplicateStrings {

	public static void main(String[] args) {

		String[] name = { "Java", "C++", "Python", "C", "JavaScript", "Java", "C++" };

		for (int i = 0; i < name.length; i++) {

			boolean duplicate = false;

			for (int j = 0; j < i; j++) {
				if (name[i].equals(name[j])) {
					duplicate = true;
//					break;
				}
			}
            
			// Only unique name
//			if (!duplicate) {
			if (duplicate == false) {
				System.out.println(name[i]);
			}

			// Only duplicate name
//			if (duplicate) {
//				if (duplicate == true) {
//					System.out.println(name[i]);
//				}

		}

	}
	
}
