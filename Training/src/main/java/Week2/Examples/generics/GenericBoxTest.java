package Week2.Examples.generics;

public class GenericBoxTest {
	public static void main(String args[]) {
		GenericBox<String> myBox = new GenericBox<String>();
		  //myBox.set(1);
		  myBox.set("1");
		  
		  System.out.println(myBox.get());
	}
}

class GenericBox<T> {
	// T stands for "Type"
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
}