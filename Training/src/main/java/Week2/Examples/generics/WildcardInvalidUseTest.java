package Week2.Examples.generics;

public class WildcardInvalidUseTest {
   public static void main(String args[]) {
	   //? myClass = new WildcardInvalidUse();
   }

}

class WildcardInvalidUse {//extends ? { //invalid super

    private <T> T method1(T t) {return t;}
//    private int method2() {
//    	//? x = 1;
//    	return method1(x); // invalid method invocation
//    } 

}
