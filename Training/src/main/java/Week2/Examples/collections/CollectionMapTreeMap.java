package Week2.Examples.collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CollectionMapTreeMap {
	
	public static void main(String[] args) {

		Map<Integer, String>animalMap = new TreeMap<>();
		animalMap.put(6, "Beaver");
		animalMap.put(3, "Dog");
		animalMap.put(2, "Cat");
		animalMap.put(5, "Mouse");
		animalMap.put(4, "Rabbit");
		
		System.out.println("================================");
		System.out.println("Animal  Map ");
		Iterator<Entry<Integer, String>> theIterator= animalMap.entrySet().iterator();  
		while(theIterator.hasNext()){  
			System.out.println(theIterator.next());  
		}  
		System.out.println("================================");	
				
		//What's special?
		System.out.println("================================");
		System.out.println("What's Unique: ");		
		System.out.println("Order of elements based o comparable key: ");
		animalMap.put(1, "Bull");
		theIterator= animalMap.entrySet().iterator();  
		while(theIterator.hasNext()){  
			System.out.println("   " + theIterator.next());  
		}  
		System.out.println("================================");
		
		animalMap = new HashMap<>();
		animalMap.put(1, "Beaver");
		animalMap.put(2, "Dog");
		animalMap.put(3, "Cat");
		animalMap.put(4, "Mouse");
		animalMap.put(5, "Rabbit");

		//Benchmark the get
		long startTime = System.nanoTime(); 
		long endTime = System.nanoTime();
		animalMap.get(3);
		long duration = endTime - startTime;
		System.out.println("Speed on traversing collection:  " + duration);
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
