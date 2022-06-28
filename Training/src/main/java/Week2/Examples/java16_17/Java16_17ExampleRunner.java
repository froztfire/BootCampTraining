package Week2.Examples.java16_17;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java16_17ExampleRunner {

	record PersonRecordInClass(String firstName, String lastName, int age) {};
	
	public static void main(String[] args) {
		System.out.println("\n==toList example==");
		System.out.println("List when using Collectors.toList()");
		List<String> employeesFromCollectorToList = Stream.of("John Doe", "Jane Smith", "Jane Doe")
				.collect(Collectors.toList());
		employeesFromCollectorToList.forEach(System.out::println);
		
		System.out.println("\nList when adding element");
		employeesFromCollectorToList.add("John Smith");
		employeesFromCollectorToList.forEach(System.out::println);
		
		System.out.println("\nList when sorting");
		employeesFromCollectorToList.sort((a,b) -> a.compareTo(b));
		employeesFromCollectorToList.forEach(System.out::println);

	}

}
