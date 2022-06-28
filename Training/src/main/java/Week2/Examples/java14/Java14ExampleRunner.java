package Week2.Examples.java14;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Java14ExampleRunner {

	public static void main(String[] args) {
		//4.1 Helpful null pointer exception - accessing field of null
				NPEDemoObject object1 = null;
				// object1.field1 = "hello world";
				
				
				//4.2 Helpful null pointer exception - accessing field of nested with null
				NPEDemoObject object2 = null;
				try {
					object2.person1.getFirstName();
				} catch(Exception e) {
					e.printStackTrace();
				}

				
				NPEDemoObject object3 = new NPEDemoObject();
				 // object3.person1.getFirstName();
				
				//4.3 Helpful null pointer exception - array
				var myArr = new Object[][] {null};
				//myArr[0][1] = new Object();
		
	}

}
