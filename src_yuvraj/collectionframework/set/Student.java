package collectionframework.set;

public class Student implements Comparable<Student> {

	private String name;
	private String standard;
	private double result;
	private int id;

	// Constructor
	public Student(int id, String name, String standard, double result) {
		this.name = name;
		this.standard = standard;
		this.result = result;
		this.id = id;
	}

	// Getter
	public int getId() {
		return id;
	}

	public double getResult() {
		return result;
	}

	public String getName() {
		return name;
	}

	public String getStandard() {
		return standard;
	}

	// Setter
	public void setId(int id) {
		this.id = id;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	@Override
	public String toString() {
		return "Student Info → " + " [ID - " + id + " $$ Name - " + name + " $$ Standard - " + standard
				+ " $$ Result(in %) - " + result + "]";
	}

	@Override
	public int compareTo(Student o) {

		// ID Comparison
		int id = Integer.compare(this.id, o.getId());
		if (id != 0) {
			return id;
		}

		// NAME Comparison
//		int name = this.name.compareTo(o.getName());
//		if (name != 0) {
//			return name;
//		}

		// STANDARD Comparison
//		int standard = this.standard.compareTo(o.getStandard());
//		if (standard != 0) {
//			return standard;
//		}

		// RESULT Comparison
		return Double.compare(this.result, o.getResult());

	}

}
