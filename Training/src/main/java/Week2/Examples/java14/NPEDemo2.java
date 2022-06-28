package Week2.Examples.java14;
public class NPEDemo2 {

	public static void main(String[] args) {
		Object myObject = null;
		myObject.toString().hashCode();	
	}

}
