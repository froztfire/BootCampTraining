package Week2.Examples.java14;
public record NewPersonRecordWithChecking(String firstName, String lastName, int age) {
	//constructor, take note no paren
	public NewPersonRecordWithChecking {
		if(age < 0) {
			System.out.println("Invalid age");
			throw new IllegalArgumentException();
		}
	}
}
