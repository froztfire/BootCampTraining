package Week2.Examples.collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class CollectionSetLinkedHashSet {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LinkedHashSet<String> animals = new LinkedHashSet<String>();
		animals.add("Beaver"); 
		animals.add("Dog");
		animals.add("Cat");    
		animals.add("Mouse");
		animals.add("Rabbit");
		
		System.out.println("================================");
		System.out.println("Animal Collection: ");

		
		//What's special?
		System.out.println("================================");
		System.out.println("What's Unique: ");
		System.out.println("Allows null");
		animals.add(null);
		animals.add(null);
		Iterator<String> theIterator = animals.iterator() ;  
		while(theIterator.hasNext()){
			System.out.println(theIterator.next());  
		}  
		
		//Benchmark the get
		System.out.println("================================");
		long startTime = System.nanoTime(); 
		long endTime = System.nanoTime();
		long duration = endTime - startTime;

		System.out.println("Speed on traversing collection:  N.A");
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
