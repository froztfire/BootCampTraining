package Week2.Examples.java14;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Java14Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//switch expressions
		System.out.println("\n==Switch expression - mixing styles===");
		int monthNumber_ex1 = 1;

		System.out.println("Switch expression with colon and yield");	

		String monthname_ex1 = switch(monthNumber_ex1) {
			case 1 : yield "January";
			case 2 : yield "February";
			// other cases
			default: yield "Unknown";
		};
		System.out.println("Month=" + monthname_ex1);
		
		// no need to put break
		System.out.println("Switch statement with arrow and variable assignment");
		String monthname_ex2 = "";
		switch(monthNumber_ex1) {
			case 1 -> monthname_ex2 = "January";
			case 2 -> monthname_ex2 = "February";
			// other cases
			default -> monthname_ex2 = "Unknown";
		};
		System.out.println("Month=" + monthname_ex2);
		
		// error combination: compile error: Mixing of different kinds of case statements '->' and  ':' is not allowed within a switch
		System.out.println("Switch expression/statement with mixed cases using colon and arrow");
//		String monthname_ex3 = switch(monthNumber_ex1) {
//			case 1 -> "January";
//			case 2 -> "February";
//			// other cases
//			default: yield "Unknown";
//		};
//		System.out.println("Month=" + monthname_ex1);
		
		
		// error combination: compile error: Syntax error on token "yield", AssignmentOperator expected after this token
		System.out.println("Switch statement with arrow and yield");
//		switch(monthNumber_ex1) {
//			case 1 -> yield "January";
//			case 2 -> yield "February";
//			// other cases
//			default -> yield "Unknown";
//		};
//		System.out.println("Month=" + monthname_ex2);
		
		//1. textBlocks
		System.out.println("\n==Text blocks===");	
		String json1 = """
			{
			 "firstName": "John",
			 "lastName": "Doe"
			}""";
		System.out.println("\nMultiline json using text blocks with no escape=\n" + json1);
		
		String json2 = """
			{\
			 "firstName": "John",\
			 "lastName": "Doe"\
			}""";
		System.out.println("\nMultiline json using text blocks with escape =\n" + json2);
		
		String json3 = """
				{\
				 "firstName": "John\sJohn",
				 "lastName": "Doe"
				}""";
			System.out.println("\nMultiline json using text blocks with escape \s=\n" + json3);
		
			
		//2. pattern matching of instanceOf
		System.out.println("\n==Pattern matching of instance of===");
		
		BigDecimal myObject = new BigDecimal(3.14);
		
		
		System.out.println("Before Java 14");		
		// have to check, declare and cast in multiple statements
		if(myObject instanceof BigDecimal) {
			BigDecimal myBigDecimal1 = (BigDecimal) myObject;
			if(myBigDecimal1.doubleValue() > 0) {
				System.out.println("Precision=" + myBigDecimal1.precision());			
			}
		}
		
		System.out.println("Since Java 14");
		// check, declare and cast in one line
		if((Object)myObject instanceof BigDecimal myBigDecimal2 && myBigDecimal2.doubleValue() > 0) {
			System.out.println("Precision=" + myBigDecimal2.precision());
		}
		
		// will not compile since myBigDecimal3 will not be available 
//		if(!((Object)myObject instanceof BigDecimal myBigDecimal3)) {
//			System.out.println("Precision=" + myBigDecimal3.precision());
//		}
		
		
		//3.Records
		System.out.println("\n==Records===");
		System.out.println("Before Java 14");	
		OldPerson oldPerson = new OldPerson("John", "Doe", 30);
		System.out.println(oldPerson);
		
		System.out.println("\nSince Java 14");	
		NewPersonRecord newPersonRecord = new NewPersonRecord("John", "Doe", 30);
		System.out.println(newPersonRecord);
		
		NewPersonRecord newPersonRecord2 = new NewPersonRecord("John", "Doe", 30);
		System.out.print("Person 1 and 2 are equal using reference:");
		System.out.println(newPersonRecord2 == newPersonRecord);
		System.out.print("Person 1 and 2 are equal using toString:");
		System.out.println(newPersonRecord2.equals(newPersonRecord));
		
		List<NewPersonRecord> myList = new ArrayList<NewPersonRecord>();
		myList.add(newPersonRecord);
		myList.add(newPersonRecord2);
		myList.forEach(System.out::println);
		
		// this will throw exception
		// NewPersonRecordWithChecking newPersonRecord3 = new NewPersonRecordWithChecking("John", "Doe", -1);
		
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
