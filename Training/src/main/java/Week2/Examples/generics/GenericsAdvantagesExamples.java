package Week2.Examples.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsAdvantagesExamples {

	public static void main(String args[]) {
		//Without Generics
		List list = new ArrayList();
		list.add("hello");
		
		//no compile time error
		list.add(10);
		list.add(10.0);
		
		//type casting is required
		String str = (String) list.get(0);
		System.out.println(str);
		
		for(int i=0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//With Generics
		List<String> list2 = new ArrayList<String>();
		list2.add("hello");
		list2.add("world");
		
		//type casting is NOT required
		String str2 = list2.get(0);
		System.out.println(str2);
				
		//compile time checking
		//list2.add(10);
		//list2.add(10.0);

		for(int i=0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
	}
}
