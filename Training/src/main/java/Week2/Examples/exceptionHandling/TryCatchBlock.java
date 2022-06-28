package Week2.Examples.exceptionHandling;

public class TryCatchBlock {

	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		}

		System.out.println("Rest of the code");
	}
}
