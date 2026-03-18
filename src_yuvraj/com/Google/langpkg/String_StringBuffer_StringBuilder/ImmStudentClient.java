package com.Google.langpkg.String_StringBuffer_StringBuilder;

import java.util.ArrayList;
import java.util.List;

public class ImmStudentClient {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Resoning");
		list.add("Math");
		
		ImmStudent is = new ImmStudent(4321, list);
		
		List<String> sub = is.getSubjects();
		sub.add("English");  //modifying copy
		
		System.out.println(is.getSubjects());
		
	}
	
}
