package Week2.Examples.collections;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class CollectionListVector {
	
	public static void main(String[] args) {
		
		Vector<String> animals = new Vector<String>();
		animals.add("Beaver"); 
		animals.add("Dog");
		animals.add("Cat");    
		animals.add("Mouse");
		animals.add("Rabbit");
		
		System.out.println("================================");
		System.out.println("Animal Collection: ");		
		Iterator<String> theIterator = animals.iterator() ;  
		while(theIterator.hasNext()){
			System.out.println(theIterator.next());  
		}  
		
		//What's special?
		System.out.println("================================");
		System.out.println("What's Unique: ");
		System.out.println("Can be traversed with Enumeration or Iterator.");
		Enumeration<String> theEnumeration = Collections.enumeration(animals) ;  
		while(theEnumeration.hasMoreElements()){
			System.out.println("   ".concat(theEnumeration.nextElement()));  
		}
		
		//Benchmark the get
		long startTime = System.nanoTime(); 
		long endTime = System.nanoTime();
		System.out.println("================================");
		animals.get(0);
		long duration = endTime - startTime;
		System.out.println("Speed on traversing collection:  " + duration);
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
