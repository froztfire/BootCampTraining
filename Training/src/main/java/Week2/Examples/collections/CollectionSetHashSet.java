package Week2.Examples.collections;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionSetHashSet {

	public static void main(String[] args) {
			
		HashSet<String> animals = new HashSet<String>();
		animals.add("Beaver"); 
		animals.add("Dog");
		animals.add("Cat");    
		animals.add("Mouse");
		animals.add("Rabbit");
		
		System.out.println("================================");
		System.out.println("Animal Collection: ");
		Iterator<String> theIterator = animals.iterator();  
		while(theIterator.hasNext()){
			System.out.println(theIterator.next());  
		}  
		
		//What's special?
		System.out.println("================================");
		System.out.println("What's Unique: ");
		System.out.println("Duplicates are ignored.");
		animals.add("Mouse");
		theIterator = animals.iterator();
		while(theIterator.hasNext()){
			System.out.println("   ".concat(theIterator.next()));  
		}  
		
		//Benchmark the get
		System.out.println("================================");
		long startTime = System.nanoTime(); 
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("Speed on traversing collection: N.A.");
		System.out.println("================================");	
		
		System.out.println("Adding 100 more animals...");		
		
		//Benchmark the Add
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
