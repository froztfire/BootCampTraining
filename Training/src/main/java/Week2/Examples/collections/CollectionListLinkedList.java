package Week2.Examples.collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionListLinkedList {

	public static void main(String[] args) {

		LinkedList<String> animals = new LinkedList<String>();
		animals.add("Beaver");
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Mouse");
		animals.add("Rabbit");

		System.out.println("================================");
		System.out.println("Animal Collection: ");
		Iterator<String> theIterator = animals.iterator();
		while (theIterator.hasNext()) {
			System.out.println(theIterator.next());
		}

		// What's special?
		System.out.println("================================");
		System.out.println("What's Unique: ");
		animals.push("Skunk");
		System.out.println("Can be used as a Stack: ".concat(animals.peek()));

		// Benchmark the get
		long startTime = System.nanoTime();
		long endTime = System.nanoTime();
		System.out.println("================================");
		System.out.println("Animal Collection: ");
		animals.get(0);
		long duration = endTime - startTime;
		System.out.println("Speed on traversing collection:  " + duration);
		System.out.println("================================");

		System.out.println("Adding 100 more animals...");

		// Benchmark the Add
		startTime = System.nanoTime();
		for (int i = 0; i < 100; i++) {
			animals.add("Animal".concat(Integer.toString(i)));
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("Speed on add:  " + duration);
		System.out.println("================================");

		System.out.println("Removing 100 animals...");
		startTime = System.nanoTime();
		for (int i = 0; i < 100; i++) {
			animals.remove("Animal".concat(Integer.toString(i)));
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("Speed on remove:  " + duration);
		System.out.println("================================");
	}
}
