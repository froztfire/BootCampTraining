package Week2.Examples.generics;

public class GenericsTypeBoundExample {
	public static <T extends Comparable<T>> int compare(T t1, T t2){
		return t1.compareTo(t2);
	}
	
	public static void main(String args[]) {
		
		int compareStrResult = GenericsTypeBoundExample.<String>compare("A", "B");
		System.out.println("A == B " + compareStrResult);
		
		compareStrResult = GenericsTypeBoundExample.<String>compare("A", "A");
		System.out.println("A == A " + compareStrResult);
		
		int compareIntResult = GenericsTypeBoundExample.<Integer>compare(1, 2);
		System.out.println("1 == 2 " + compareIntResult);
		
		compareIntResult = GenericsTypeBoundExample.<Integer>compare(1, 1);
		System.out.println("1 == 1 " + compareIntResult);
		
		//Error for non comparable
		//int compareMyGenResult = GenericsTypeBoundExample.<MyGen>compare(new MyGen(), new MyGen());
		
		int compareMyGenComparableResult = GenericsTypeBoundExample.<Employee>compare(new Employee("Mau", 1), new Employee("Bob", 2));
		System.out.println("comparable result " + compareMyGenComparableResult);
	}
}
