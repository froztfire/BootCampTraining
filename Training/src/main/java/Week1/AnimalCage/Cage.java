package Week1.AnimalCage;

import java.util.ArrayList;

public class Cage {
    public ArrayList<Animal> cage;

    public ArrayList<Animal> getCage() {
        return cage;
    }
    public void setCage(ArrayList<Animal> cage) {
        this.cage = cage;
    }

    public void free(String name){
        System.out.println("You are now Free " + name);
    }
}
