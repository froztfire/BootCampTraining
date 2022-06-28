package Week2.Examples.collections;
import java.util.ArrayDeque;
import java.util.Iterator;

public class CollectionArrayDeque {

	public static void main(String[] args) {
		
		ArrayDeque<String> animals = new ArrayDeque<String>();
		animals.add("Rabbit");
		animals.add("Beaver");
		animals.add("Mouse");
		animals.add("Dog");
		animals.add("Cat");
		
		System.out.println("================================");
		System.out.println("Animal Collection: ");
		Iterator<String> theIterator = animals.iterator();  
		while(theIterator.hasNext()){
			System.out.println(theIterator.next());  
		}  
		
		//What's special?
		System.out.println("================================");
		System.out.println("What's Unique: ");
		System.out.println("Get first position: " + animals.peekFirst());
		
		System.out.println("Get last position: " + animals.peekLast());
		
		System.out.println("Add/remove from first position: ");
		animals.addFirst("Bull");
		theIterator = animals.iterator();  
		while(theIterator.hasNext()){
			System.out.println("   " + theIterator.next());  
		}  	
		
		System.out.println("Add/remove from last position: ");
		animals.addLast("Bull");
		theIterator = animals.iterator();  
		while(theIterator.hasNext()){
			System.out.println("   " + theIterator.next());  
		}  	
		
		System.out.println("Option to reverse priority:");
		theIterator = animals.descendingIterator();
		while(theIterator.hasNext()){
			System.out.println("   " + theIterator.next());  
		}  	
		System.out.println("================================");
		
		//Benchmark the get
		long startTime = System.nanoTime(); 
		long endTime = System.nanoTime();
		animals.peek();
		long duration = endTime - startTime;
		System.out.println("Speed on traversing collection:  " + duration);
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
