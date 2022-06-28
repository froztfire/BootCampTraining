package Week2.Examples.generics;

public class TestGenericClass {
	public static void main(String args[]) {
		MyGen<Integer> myGenInt = new MyGen<Integer>();
		myGenInt.set(2);
		//.set("hello");//Compile time error
		System.out.println(myGenInt.get());
		
		
		MyGen<String> myGenStr = new MyGen<String>();
		myGenStr.set("hello");
		//myGenStr.set(2);//Compile time error
		System.out.println(myGenStr.get());
		
		MyGen<Person> myGenPerson = new MyGen<Person>();
		myGenPerson.set(new Person("Mau", "Tuazon"));
		//myGenPerson.set(2);//Compile time error
		System.out.println(myGenPerson.get().getfName());
		
	}
}

class Person {
	String fName;
	String lName;
	
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	
	public Person(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	}
}
