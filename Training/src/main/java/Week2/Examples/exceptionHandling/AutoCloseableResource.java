package Week2.Examples.exceptionHandling;

public class AutoCloseableResource implements AutoCloseable{
	public AutoCloseableResource() {
		System.err.println("AutoCloseableResource initiliazed");
	}

	@Override
	public void close() throws Exception {
		System.err.println("AutoCloseableResource closed");
		
	}
}
