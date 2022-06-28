package Week2.Examples.exceptionHandling;

import java.io.*;

class MyClass {
	void method() throws IOException {
		throw new IOException("IOException occurs");
	}
}

public class ThrowsExample {
	public static void main(String args[]) {
		try {
			MyClass m = new MyClass();
			m.method();
		} catch (Exception e) {
			System.out.println("Exception handled");
		}

		System.out.println("rest of the code");
	}
}