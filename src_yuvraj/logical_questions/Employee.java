package logical_questions;

public class Employee {
	
	String empName;
	double salary;
	String department;
	String address;
	
	public Employee(String empName, double salary, String department, String address) {
		super();
		this.empName = empName;
		this.salary = salary;
		this.department = department;
		this.address = address;
	}

	public Employee() {
		super();
	}
	
	public String getEmpName() {
		return empName;
	}
	public double getSalary() {
		return salary;
	}
	public String getDepartment() {
		return department;
	}
	public String getAddress() {
		return address;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empName: " + empName + ", salary: " + salary + ", department: " + department + ", address: "
				+ address + "]";
	}
	
}
