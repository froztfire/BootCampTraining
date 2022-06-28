package Week2.Examples.collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionListArrayList {

	public static void main(String[] args) {	
		
		List<String> animals = new ArrayList<String>();
		
		animals.add("Beaver"); 
		animals.add("Dog");
		animals.add("Cat");    
		animals.add("Mouse");
		animals.add("Rabbit");
		
		//Ways to traverse a ArrayList/List
		System.out.println("Using a for loop");
		for(int i = 0; i < animals.size(); i++) {
			System.out.println("   " + animals.get(i));
		}
		System.out.println("================================");	
		
		System.out.println("Using an Iterator");
		Iterator theIterator= animals.iterator();  
		while(theIterator.hasNext()){  
			System.out.println("   " + theIterator.next());  
		} 		
		System.out.println("================================");	
		
		System.out.println("Using a for loop since Java 6");
		for(String theAnimal : animals) {
			System.out.println("   " + theAnimal);
		}
		System.out.println("================================");	
		
		System.out.println("What's Unique: ");
		System.out.println("Lists can accept any types.");
		ArrayList untypedAnimals = new ArrayList();
		untypedAnimals.add("Cow");
		untypedAnimals.add(2);
		Animal animal = new Animal();
		untypedAnimals.add(animal);
		System.out.println("Untyped list: " + untypedAnimals);
		System.out.println("================================");	
		
		//Benchmark the Get
		long startTime = System.nanoTime(); 
		long endTime = System.nanoTime();
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
