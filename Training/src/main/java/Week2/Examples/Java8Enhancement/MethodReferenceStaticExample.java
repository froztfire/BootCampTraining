package Week2.Examples.Java8Enhancement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceStaticExample {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Mau", "Tuazon", 2));
		students.add(new Student("Ronyan", "Flores", 1));
		students.add(new Student("Chance", "Galiza", 3));

		System.out.println("BEFORE SORT");
		students.forEach(person -> System.out.println(person.getFirstName() + " " + person.getYear()));

		//using lambda
		//Collections.sort(students, (a,b) -> Student.compareByYear(a, b));
		
		//using reference to a static method
		Collections.sort(students, Student::compareByYear);

		System.out.println("\nAFTER SORT");
		students.forEach(person -> System.out.println(person.getFirstName() + " " + person.getYear()));
	}
}

class Student {

	private String firstName;
	private String lastName;
	private Integer year;

	public Student(String firstName, String lastName, Integer year) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.year = year;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public Integer getYear() {
		return this.year;
	}

	public static int compareByYear(Student a, Student b) {
		return a.year.compareTo(b.year);
	}
}
