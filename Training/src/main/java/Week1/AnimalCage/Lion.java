package Week1.AnimalCage;

public class Lion extends Animal implements Walkable {
    public void walkable() {
        System.out.println("Walking...Walking");
    }
    public void eating() {
        System.out.println("I love to eat Fresh Meat!!");
    }
    @Override
    public void makeNoise() {
        System.out.println("Raawwwwwrr.. Raawwwwwwrr");
    }

}
