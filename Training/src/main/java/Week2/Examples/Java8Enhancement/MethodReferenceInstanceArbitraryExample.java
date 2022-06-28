package Week2.Examples.Java8Enhancement;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceInstanceArbitraryExample {
	public static void main(String args[]) {
		List<String> names = Arrays.asList("Mau", "Ronyan", "Chance");
		System.out.println("BEFORE SORT");
		names.forEach(System.out::println);
		
		//using lambda
		//names.sort((a, b) -> a.compareTo(b));
		
		//using instance method of an arbitrary object of a particular type
		names.sort(String::compareTo);
		
		System.out.println("AFTER SORT");
		names.forEach(System.out::println);
		
	}
}
