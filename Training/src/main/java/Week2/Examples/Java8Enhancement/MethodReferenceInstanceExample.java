package Week2.Examples.Java8Enhancement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodReferenceInstanceExample {

	public static void main(String[] args) {
		List<Student2> students = new ArrayList<Student2>();
		students.add(new Student2("Mau", "Tuazon", 2));
		students.add(new Student2("Ronyan", "Flores", 1));
		students.add(new Student2("Chance", "Galiza", 3));

		System.out.println("BEFORE SORT");
		students.forEach(person -> System.out.println(person.getFirstName() + " " + person.getYear()));

		ComparisonProvider provider = new ComparisonProvider();
		
		//using lambda
		//Collections.sort(students, (a,b) -> provider.compareByYear(a,b));
		
		//using reference to an instance method of a particular object
		Collections.sort(students, provider::compareByYear);

		System.out.println("\nAFTER SORT");
		students.forEach(person -> System.out.println(person.getFirstName() + " " + person.getYear()));
	}
}

class Student2 {

	private String firstName;
	private String lastName;
	private Integer year;

	public Student2(String firstName, String lastName, Integer year) {
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

}

class ComparisonProvider {
	public int compareByYear(Student2 a, Student2 b) {
		return a.getYear().compareTo(b.getYear());
	}
}
