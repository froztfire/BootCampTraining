package Week2.Examples.generics;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundedWildcardExample {
	public static double sumOfList(List<? extends Number> list) {
		double s = 0.0;
		for (Number n : list)
			s += n.doubleValue();
		return s;
	}

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		System.out.println("displaying the sum= " + sumOfList(list1));

		ArrayList<Double> list2 = new ArrayList<Double>();
		list2.add(30.0);
		list2.add(40.0);
		System.out.println("displaying the sum= " + sumOfList(list2));

	}
}
