package Week2.Examples.java16_17;

import java.util.Arrays;
import java.util.List;
//import java.util.random.RandomGenerator;
//import java.util.random.RandomGeneratorFactory;
import java.util.stream.Collectors;
import java.util.stream.Stream;
// import jdk.incubator.vector.IntVector;
// import sealed.demo.LogoutCommand;

public class Java16_17Examples {
	record PersonRecordInClass(String firstName, String lastName, int age) {
	};

	// this will error as LogoutAndDeleteCacheCommand is not visible on
	// LogoutCommand
	// final class LogoutAndDeleteCacheCommand extends LogoutCommand{}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. toList
			// this is a mutable list
			System.out.println("\n==toList example==");
			System.out.println("List when using Collectors.toList()");
			List<String> employeesFromCollectorToList = Stream.of("John Doe", "Jane Smith", "Jane Doe")
					.collect(Collectors.toList());
			employeesFromCollectorToList.forEach(System.out::println);
			
			System.out.println("\nList when adding element");
			employeesFromCollectorToList.add("John Smith");
			employeesFromCollectorToList.forEach(System.out::println);
			
			System.out.println("\nList when sorting");
			employeesFromCollectorToList.sort((a,b) -> a.compareTo(b));
			employeesFromCollectorToList.forEach(System.out::println);
			
			// this is an immutable list
			System.out.println("\n\nList when using Stream.toList()");
			List<String> employeesStreamToList = Stream.of("John Doe", "Jane Smith", "Jane Doe").toList();
			employeesStreamToList.forEach(System.out::println);
			
			// this will throw UnsupportedOperationException on runtime
			System.out.println("\nList when adding element");
			// employeesStreamToList.add("John Smith");
			// employeesStreamToList.forEach(System.out::println);
			
			// this will throw UnsupportedOperationException on runtime
			System.out.println("\nList when sorting");
			// employeesStreamToList.sort((a,b) -> a.compareTo(b));
			// employeesStreamToList.forEach(System.out::println);

		//2. mapMulti
			System.out.println("\n==mapMulti example==");
			System.out.println("Using mapMulti");
			List<String> fruits1 = Stream.of("apple", "banana", "cherry")
			  .<String>mapMulti((s, c) -> {
			    c.accept(s.toUpperCase());
			    c.accept(s.toLowerCase());
			  }).toList();
			fruits1.forEach(System.out::println);
			
			System.out.println("\nUsing flatMap");
			List<String> fruits2 = Stream.of("apple", "banana", "cherry")
			  .flatMap(s -> Stream.of(s.toUpperCase(), s.toLowerCase())).toList();
			fruits2.forEach(System.out::println);
			
			System.out.println("\nUsing mapMultiToDouble");
			// check if integer, multiply with 1.01, get sum
			List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
			double percentage = .01;
			double sum = integers.stream()
			  .mapMultiToDouble((integer, consumer) -> {
			    if (integer % 2 == 0) {
			        consumer.accept(integer * (1 + percentage));
			    }
			  })
			  .sum();
			System.out.println("Sum of double = " + sum);
		
		//3. Local record
			System.out.println("\n==local record example==");
			record PersonRecordInMethod(String firstName, String lastName, int age) {};
			System.out.println(new PersonRecordInMethod("John", "Doe", 30));
			System.out.println(new PersonRecordInClass("Jane", "Smith", 30));
			
		//4. Pattern matching of instanceof
			System.out.println("\n==Pattern matching of instance of===");
			
			PersonRecordInClass myRecord1 = new PersonRecordInClass("John", "Doe", 30);
			Record myRecord2 = new PersonRecordInClass("John", "Doe", 30);
			
			System.out.println("Since Java 16");
			// check, declare and cast in one line
			// compile error Expression type cannot be a subtype of Pattern type if using myREcord1
			//if(myRecord1 instanceof PersonRecordInClass myPersonRecordInClass && myPersonRecordInClass.age() > 20) {
			if(myRecord2 instanceof PersonRecordInClass myPersonRecordInClass && myPersonRecordInClass.age() > 20) {
				// pattern variable is no longer final and can re reassigned
				myPersonRecordInClass = new PersonRecordInClass(myPersonRecordInClass.firstName + " adult", "Doe", 30);
				System.out.println(myPersonRecordInClass);
			}
			
		//5. Vector API
			System.out.println("\n==Vector API===");
			int[] a = {1, 2, 3, 4};
			int[] b = {5, 6, 7, 8};
			
			System.out.println("Before Java 16 using scalar computation");
			int[] c = new int[a.length];

			for (int i = 0; i < a.length; i++) {
			    c[i] = a[i] * b[i];
			    System.out.println(c[i]);
			}
			
			// compiling but not running in eclipse IDE, run in JSHell
//			System.out.println("Since Java 16 using vector computation");
//			var vectorA = IntVector.fromArray(IntVector.SPECIES_128, a, 0);
//			var vectorB = IntVector.fromArray(IntVector.SPECIES_128, b, 0);
//			var vectorC = vectorA.mul(vectorB);
//			vectorC.intoArray(c, 0);
			
		//6. Enhanced Pseudo-Random Number Generators
		  // java.util.random not resolved in eclipse IDE even with jdk 17 setup as compiler, run in JSHell	
		  // legacy
//	      RandomGenerator randomGenerator1 = RandomGeneratorFactory.of("Random").create(42);
//
//	      // default L32X64MixRandom
//	      RandomGenerator randomGenerator2 = RandomGeneratorFactory.getDefault().create();
//
//	      // Passing the same seed to random, and then calling it will give you the same set of numbers
//	      // for example, seed = 999
//	      RandomGenerator randomGenerator3 = RandomGeneratorFactory.of("Xoshiro256PlusPlus").create(999);
//
//	      RandomGenerator randomGenerator = randomGenerator1;
//	      System.out.println(randomGenerator.getClass());
//
//		  int result = randomGenerator.nextInt(11);
//	      System.out.println(result);
			
	}

}
