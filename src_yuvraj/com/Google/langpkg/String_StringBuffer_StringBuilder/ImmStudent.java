package com.Google.langpkg.String_StringBuffer_StringBuilder;

import java.util.ArrayList;
import java.util.List;

public final class ImmStudent {

	private final int rollNumber;
	private final List<String> subjects;

	public ImmStudent(int rollNumber, List<String> subjects) {
		this.rollNumber = rollNumber;
		this.subjects = new ArrayList<>(subjects); // defensive copy
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public List<String> getSubjects() {
		return new ArrayList<>(subjects); // return copy
	}
}
