package Week2.Examples.generics;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildcard {
	public static void display(List<?> list) {

		for (Object o : list) {
			System.out.println(o);
		}

	}

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(1, 2, 3);
		System.out.println("displaying the Integer values");
		display(list1);
		List<String> list2 = Arrays.asList("One", "Two", "Three");
		System.out.println("displaying the String values");
		display(list2);
	}

}
