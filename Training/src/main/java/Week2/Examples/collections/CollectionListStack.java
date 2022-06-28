package Week2.Examples.collections;
import java.util.Iterator;
import java.util.Stack;

public class CollectionListStack {

	public static void main(String[] args) {
		
		Stack<String> animals = new Stack<String>();
		
		animals.push("Beaver"); 
		animals.push("Dog");
		animals.push("Cat");    
		animals.push("Mouse");
		animals.push("Rabbit");
		
		System.out.println("================================");
		System.out.println("Animal Collection: ");		
		Iterator<String> theIterator = animals.iterator() ;  
		while(theIterator.hasNext()){
			System.out.println(theIterator.next());  
		}  
		
		//What's special?
		System.out.println("================================");
		System.out.println("What's Unique: ");
		System.out.println("Last In - Fisrt Out");
		int theStackSize = animals.size();
		for(int i = 0; i < theStackSize; i++) {
			System.out.println("   Whats on top of the Stack: " + animals.pop());
		}			
		String bull = "Bull";
		animals.push(bull);
		System.out.println("Can do a search directly. Found at position: " + animals.search(bull));
		animals.remove("Bull");
		
		animals.push(null);
		animals.push(null);
		
		//Benchmark the get
		animals.push("Beaver"); 
		animals.push("Dog");
		animals.push("Cat");    
		animals.push("Mouse");
		animals.push("Rabbit");
		long startTime = System.nanoTime(); 
		long endTime = System.nanoTime();
		System.out.println("================================");
		animals.get(0);		
		long duration = endTime - startTime;
		System.out.println("Speed on traversing collection:  " + duration);
		System.out.println("================================");	
				
		//Benchmark the Add
		System.out.println("Adding 100 more animals...");
		startTime = System.nanoTime(); 
		for(int i = 0; i < 100; i++) {
			animals.push("Animal".concat(Integer.toString(i)));
		}		
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("Speed on add:  " + duration);
		System.out.println("================================");	
		
		//Benchmark the remove
		System.out.println("Removing 100 animals...");	
		startTime = System.nanoTime(); 
		for(int i = 0; i < 100; i++) {
			animals.pop();
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("Speed on remove:  " + duration);
		System.out.println("================================");	
	}
}
