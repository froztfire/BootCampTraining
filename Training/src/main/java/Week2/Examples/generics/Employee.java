package Week2.Examples.generics;

public class Employee implements Comparable<Employee> {
	private final String name;
	private final int id;

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return String.format("{%s,%s}", name, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Employee employee = (Employee) obj;
		return employee.id == id;
	}

	@Override
	public int compareTo(Employee e) {
		return id - e.id;
	}
}
