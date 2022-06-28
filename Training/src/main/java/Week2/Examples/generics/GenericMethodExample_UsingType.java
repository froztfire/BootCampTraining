package Week2.Examples.generics;

public class GenericMethodExample_UsingType {
	
	public static <T> boolean isEqual(MyGen<T> g1, MyGen<T> g2){
		return g1.get().equals(g2.get());
	}
	
	public static void main(String args[]) {
		MyGen<String> g1 = new MyGen<String>();
		g1.set("hello");
		
		MyGen<String> g2 = new MyGen<String>();
		g2.set("world");
		
		boolean isEqualStr = GenericMethodExample_UsingType.<String>isEqual(g1, g2);
		System.out.println(isEqualStr);
		
		/////
		
		MyGen<Integer> g3 = new MyGen<Integer>();
		g3.set(1);
		
		MyGen<Integer> g4 = new MyGen<Integer>();
		g4.set(1);
		
		boolean isEqualInt = GenericMethodExample_UsingType.<Integer>isEqual(g3, g4);
		System.out.println(isEqualInt);
	}
}
