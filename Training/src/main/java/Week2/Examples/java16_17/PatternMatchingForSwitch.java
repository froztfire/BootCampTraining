package Week2.Examples.java16_17;

public class PatternMatchingForSwitch {
	record PersonRecordInClass(String firstName, String lastName, int age) {};

	public static void main(String[] args) {
		System.out.println(test(65));
		System.out.println(test("Hello world"));
		System.out.println(test(new PersonRecordInClass("John", "Doe", 30)));
		System.out.println(test(null));
		System.out.println(test(true));

	}

	public static String test(Object obj) {
		return switch(obj) {
		    case Integer i -> "It is an integer";
		    case String s -> "It is a string";
			case PersonRecordInClass p && p.age > 20 -> "It is an adult person";
			case PersonRecordInClass p -> "It is a person";
			case null -> "It is a null object";
		    default -> "It is none of the known data types";
     
		};
	}

}
