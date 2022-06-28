package Week2.Examples.exceptionHandling;

public class MultipleCatchBlock2 {

	public static void main(String[] args) {

		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("An exception occurs");
		}

		System.out.println("rest of the code");
	}
}
