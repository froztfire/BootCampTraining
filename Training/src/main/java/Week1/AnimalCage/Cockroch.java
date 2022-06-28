package Week1.AnimalCage;

public class Cockroch extends Animal implements Flyable, Crawlable {

    public void crawlable(){

        System.out.println("Crawling... Crawling..");
    }
    public void flyable(){

        System.out.println("Flying..Flying..");
    }
    public void eating() {
        System.out.println("I love to eat insect!!");
    }

    @Override
    public void makeNoise() {
        System.out.println("KSHH KSHHHH...!!");
    }


}


