package collectionframework.set;

import java.util.Iterator;
import java.util.TreeSet;

public class StudentTest {

	public static void main(String[] args) {

		TreeSet <Student> student = new TreeSet<>();
		
		student.add(new Student (1, "Steve", "12th", 78.22));
		student.add(new Student (4, "Max", "11th", 81.91));
		student.add(new Student (2, "Will", "10th", 80.73));
		student.add(new Student (3, "Lucas", "9th", 82.34));
		student.add(new Student (7, "Dustin", "10th", 74.86));
		student.add(new Student (5, "Eleven", "9th", 68.55));
		student.add(new Student (6, "Mike", "8th", 78.58));
		student.add(new Student (8, "Nancy", "12th", 85.34));
		student.add(new Student (4, "Max", "11th", 81.90));
		
		Iterator <Student> itr = student.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
