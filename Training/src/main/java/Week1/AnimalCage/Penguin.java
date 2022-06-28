package Week1.AnimalCage;

public class Penguin extends Animal implements Walkable, Swimmable {

    public void swimmable(){
        System.out.println("Swim..Splash");
    }
    public void walkable() {
        System.out.println("Walking...Walking");
    }
    public void eating() {
        System.out.println("I love to eat Fresh Fish!!");
    }

    @Override
    public void makeNoise() {
        System.out.println("Flaap!! Flaap!...!!");
    }
}
