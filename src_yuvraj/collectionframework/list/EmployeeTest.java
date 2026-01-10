package collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {

		List<Employee> emp = new ArrayList<Employee>();

		emp.add(new Employee(01, "JyotiDi"));
		emp.add(new Employee(02, "Bhupesh"));
		emp.add(new Employee(03, "PoojaDi"));
		emp.add(new Employee(01, "Yuvi"));
		emp.add(new Employee(0, null));
		emp.add(null);

		Iterator<Employee> iterator = emp.iterator();

		System.out.println("|++++++++++-> Iterate list by the help of while <-++++++++++|");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("|++++++++++-> Iterate list by the help of for <-++++++++++|");
		for (int i = 0; i < emp.size(); i++) {
			System.out.println(emp.get(i));
		}

		System.out.println("|++++++++++-> Iterate list by the help of advance for <-++++++++++|");
		for (Employee e : emp) {
			System.out.println(e);
		}

		System.out.println("|++++++++++-> Iterate list by the help of forEach <-++++++++++|");
		emp.forEach((e1) -> {
			System.out.println(e1);
		});

	}

}
