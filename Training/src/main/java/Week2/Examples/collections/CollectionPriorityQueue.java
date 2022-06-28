package Week2.Examples.collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class CollectionPriorityQueue {

	public static void main(String[] args) {
		
		PriorityQueue<String> animals = new PriorityQueue<String>();
		animals.add("Zebra");
		animals.add("Rabbit");
		animals.add("Beaver");
		animals.add("Mouse");
		animals.add("Cat");

		
		System.out.println("================================");
		System.out.println("Animal Collection: ");
		Iterator<String> theIterator = animals.iterator() ;  
		while(theIterator.hasNext()){
			System.out.println(theIterator.next());  
		}  
		
		//What's special?
		System.out.println("================================");
		System.out.println("What's Unique: ");
		System.out.println("Priority Queue sorts then FIFO");
		System.out.println("Sorted queue is: " + animals);
		int theQueueSize = animals.size();
		for(int i = 0; i < theQueueSize; i++) {
			System.out.println("   Removing: " + animals.poll());
			System.out.println("      The head now is: " +animals.peek());
		}	
		
		//Benchmark the get
		System.out.println("================================");
		long startTime = System.nanoTime(); 
		long endTime = System.nanoTime();
		animals.peek();
		long duration = endTime - startTime;
		System.out.println("Speed on traversing collection: " + duration);
		System.out.println("================================");		
		
		//Benchmark the Add
		System.out.println("Adding 100 more animals...");	
		startTime = System.nanoTime(); 
		for(int i = 0; i < 100; i++) {
			animals.add("Animal".concat(Integer.toString(i)));
		}		
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("Speed on add:  " + duration);
		System.out.println("================================");	
		
		System.out.println("Removing 100 animals...");	
		startTime = System.nanoTime(); 
		for(int i = 0; i < 100; i++) {
			animals.remove("Animal".concat(Integer.toString(i)));
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("Speed on remove:  " + duration);
		System.out.println("================================");
	}

}
