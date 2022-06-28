package Week2.Examples.generics;

public class BoxTest {
  public static void main(String args[]) {
	  Box myBox = new Box();
	  myBox.set(1);
	  myBox.set("1");
	  
	  System.out.println(myBox.get());
  }
}

class Box {
    private Object object;

    public void set(Object object) { this.object = object; }
    public Object get() { return object; }
}