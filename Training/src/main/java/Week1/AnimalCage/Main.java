package Week1.AnimalCage;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Cage cage = new Cage(); //Instantiate the cage class to create new cage object
        ArrayList<Animal> flyingAnimals = new ArrayList<>();  // Instantiate list of Animals to create new flyingAnimals object

        Lion lion = new Lion();
        lion.setName("Simba");
        lion.setWeight(60);
        lion.setBreed("White Lion");
        lion.setSkinColor("White");
        System.out.println("Animal Name: " + lion.getName());
        System.out.println("Breed: " + lion.getBreed());
        System.out.println("Color: " + lion.getSkinColor());
        System.out.println("Weight: " + lion.getWeight() + " kg");
        System.out.println("Can do: ");
        lion.walkable();
        lion.eating();
        lion.makeNoise();
        System.out.println("");
        System.out.println("");
        if (lion instanceof Flyable) {  // Checking the lion if Flyable
            flyingAnimals.add(lion);   //if true, lion will add to flyingAnimals object
        }

        Penguin penguin = new Penguin();
        penguin.setName("Penguin");
        penguin.setBreed("Magellanic Penguin");
        penguin.setSkinColor("White");
        penguin.setWeight(10);
        System.out.println("Animal Name: " + penguin.getName());
        System.out.println("Breed: " + penguin.getBreed());
        System.out.println("Color: " + penguin.getSkinColor());
        System.out.println("Weight: " + penguin.getWeight() + " kg");
        System.out.println("Can do: ");
        penguin.walkable();
        penguin.swimmable();
        penguin.eating();
        penguin.makeNoise();
        System.out.println("");
        System.out.println("");
        if (penguin instanceof Flyable) {  // Checking penguin if Flyable
            flyingAnimals.add(penguin); // polymorphism
        }

        Cat cat = new Cat();
        cat.setName("Cat");
        cat.setBreed("Persian");
        cat.setSkinColor("Yellow-Gold");
        cat.setWeight(8);
        System.out.println("Animal Name: " + cat.getName());
        System.out.println("Breed: " + cat.getBreed());
        System.out.println("Color: " + cat.getSkinColor());
        System.out.println("Weight: " + cat.getWeight() + " kg");
        System.out.println("Can do: ");
        cat.walkable();
        cat.eating();
        cat.makeNoise();
        System.out.println("");
        System.out.println("");
        if (cat instanceof Flyable) { // Checking cat if Flyable
            flyingAnimals.add(cat);   // polymorphism
        }

        Dog dog = new Dog();
        dog.setName("Dog");
        dog.setBreed("Labrador");
        dog.setSkinColor("Black");
        dog.setWeight(15);
        System.out.println("Animal Name: " + dog.getName());
        System.out.println("Breed: " + dog.getBreed());
        System.out.println("Color: " + dog.getSkinColor());
        System.out.println("Weight: " + dog.getWeight() + " kg");
        System.out.println("Can do: ");
        dog.walkable();
        dog.eating();
        dog.makeNoise();
        System.out.println("");
        System.out.println("");
        if (dog instanceof Flyable) {   // Checking dog if Flyable
            flyingAnimals.add(dog); // polymorphism
        }

        Cockroch cockroch = new Cockroch();
        cockroch.setName("Cockroch");
        cockroch.setBreed("Hissing Cockroch");
        cockroch.setSkinColor("Black");
        cockroch.setWeight(1);
        System.out.println("Animal Name: " + cockroch.getName());
        System.out.println("Breed: " + cockroch.getBreed());
        System.out.println("Color: " + cockroch.getSkinColor());
        System.out.println("Weight: " + cockroch.getWeight() + " kg");
        System.out.println("Can do: ");
        cockroch.crawlable();
        cockroch.flyable();
        cockroch.eating();
        cockroch.makeNoise();
        System.out.println("");
        System.out.println("");
        if (cockroch instanceof Flyable) {  // Checking cockroach if Flyable
            flyingAnimals.add(cockroch);
        }

        cage.setCage(flyingAnimals); // setting of flying animals to cage array List
        System.out.println("Cage Flying Animals");
        ArrayList<Animal> cagedAnimals = cage.getCage();  // get the list of caged animals

        for (Animal animal: cagedAnimals) {
            System.out.println(animal.getName());   //print all caged animals
        }

        System.out.println("Flying Animals set to be free:");
        Cage freeAnimals = new Cage();
        for (Animal animal: cagedAnimals) {
            freeAnimals.free(animal.getName());
        }
    }
}
