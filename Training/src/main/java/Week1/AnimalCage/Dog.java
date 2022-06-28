package Week1.AnimalCage;

public class Dog extends Animal implements Walkable {
    public void walkable() {
        System.out.println("Walking...Walking");
    }
    public void eating() {
        System.out.println("I love to eat Dog Food!!");
    }

    @Override
    public void makeNoise() {
        System.out.println("Awww!! Awww!...!!");
    }

}
