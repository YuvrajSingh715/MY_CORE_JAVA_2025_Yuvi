package collectionframwork.map;

public class Hospital implements Comparable<Hospital> {

	private String name;
	private int age;
	private String disease;

	public Hospital(String name, int age, String disease) {
		this.name = name;
		this.age = age;
		this.disease = disease;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getDisease() {
		return disease;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	@Override
	public String toString() {
		return "Patient info ::>> [Name: " + name + ", Age: " + age + ", Disease: " + disease + "]";
	}

	@Override
	public int compareTo(Hospital o) {

		int name = this.name.compareTo(o.name);
		if (name != 0) {
			return name;
		}

		int age = Integer.compare(this.age, o.age);
		if (age != 0) {
			return age;
		}

		return this.disease.compareTo(o.disease);
	}

}
