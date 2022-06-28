package Week2.Examples.exceptionHandling;

import java.io.Closeable;
import java.io.IOException;

public class CloseableResource implements Closeable{
	public CloseableResource() {
		System.err.println("CloseableResource initiliazed");
	}

	@Override
	public void close() throws IOException {
		System.err.println("CloseableResource closed");
		
	}
}
