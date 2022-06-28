package Week2.Examples.collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CollectionMapLinkedHashMap {

	public static void main(String[] args) {

		Map<Integer, String>animalMap = new LinkedHashMap<>();
		animalMap.put(5, "Beaver");
		animalMap.put(2, "Dog");
		animalMap.put(1, "Cat");
		animalMap.put(10, "Mouse");
		animalMap.put(9, "Rabbit");
		
		System.out.println("================================");
		System.out.println("Animal  Map ");
		Iterator<Entry<Integer, String>> theIterator= animalMap.entrySet().iterator();  
		while(theIterator.hasNext()){  
			System.out.println(theIterator.next());  
		}  
		System.out.println("================================");	
				
		//What's special?
		System.out.println("What's Unique: ");		
		System.out.println("Retains order of elements: ");
		animalMap.put(6, "Rabbit");
		theIterator= animalMap.entrySet().iterator();  
		while(theIterator.hasNext()){  
			System.out.println("   " + theIterator.next());  
		}  
		System.out.println("================================");	
		
		animalMap.put(1, "Beaver");
		animalMap.put(2, "Dog");
		animalMap.put(3, "Cat");
		animalMap.put(4, "Mouse");
		animalMap.put(5, "Rabbit");
		
		theIterator= animalMap.entrySet().iterator();  
		while(theIterator.hasNext()){  
			System.out.println("   " + theIterator.next());  
		}  

		//Benchmark the get
		long startTime = System.nanoTime(); 
		long endTime = System.nanoTime();
		animalMap.get(3);
		long duration = endTime - startTime;
		System.out.println("Speed on get:  " + duration);
		System.out.println("================================");	
				
		//Benchmark the Add
		System.out.println("Adding 100 more animals...");	
		startTime = System.nanoTime(); 
		for(int i = 0; i < 100; i++) {
			animalMap.put(i+6, "Animal".concat(Integer.toString(i)));
		}		
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("Speed on add:  " + duration);
		System.out.println("================================");	
		
		System.out.println("Removing 100 animals...");	
		startTime = System.nanoTime(); 
		for(int i = 0; i < 100; i++) {
			animalMap.remove(i+6, "Animal".concat(Integer.toString(i)));
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("Speed on remove:  " + duration);
		System.out.println("================================");
		
		
	}
}
