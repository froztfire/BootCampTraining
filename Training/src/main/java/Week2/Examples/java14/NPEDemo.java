package Week2.Examples.java14;
public class NPEDemo {
	static Object myObject = null;
	
	public static void main(String[] args) {
		myObject.toString().hashCode();	
	}

}
