package Week2.Examples.collections;


public class Inheritance {
	public static void main(String[] args) {	
		Animal animal = new Animal();
		animal.eat();
		
		Mammal mammal = new Mammal();		
		mammal.eat();		
		System.out.println(mammal.lifeForm + " " + mammal.hasMammaryGland);
	}
}


class Animal {
	public Animal() {
		System.out.println("Constructor Animal3()");
	}
	
	public String lifeForm = "Fauna";
	
	public void eat() {
		System.out.println("Yum! Yum!");
	}
}

class Mammal extends Animal {
	public Mammal() {
		System.out.println("Constructor Mammal()");
	}
	
	public boolean hasMammaryGland = true;
}
