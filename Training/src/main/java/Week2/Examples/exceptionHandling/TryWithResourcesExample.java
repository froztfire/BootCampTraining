package Week2.Examples.exceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
	static String readFirstLineFromFile(String path) throws Exception {

		try (AutoCloseableResource acr = new AutoCloseableResource();
				CloseableResource cr = new CloseableResource();
				BufferedReader br = new BufferedReader(new FileReader(path))) {
			return br.readLine();
		}

	}

	public static void main(String args[]) {
		try {
			TryWithResourcesExample.readFirstLineFromFile("NonExistingFile.txt");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("IOExceptionCaught");
		} catch (Exception e) {
			System.out.println("ExceptionCaught");
		}
	}
}

/* Usual try-catch */
//try {
//	AutoCloseableResource acr = new AutoCloseableResource();
//	CloseableResource cr = new CloseableResource();
//	BufferedReader br = new BufferedReader(new FileReader(path));
//	return br.readLine();
//} catch (IOException e) {
//	e.printStackTrace();
//	System.out.println("IOExceptionCaught");
//}
//return "";