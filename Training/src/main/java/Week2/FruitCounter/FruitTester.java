package Week2.FruitCounter;

import java.util.Map;
import java.util.Scanner;

public class FruitTester {

    public static void main(String[] args) {
        FruitCounter counter = new FruitCounter();              // Instantiate fruit counter class to make counter object
        System.out.println("Available Fruits: ");

        counter.fruitList().forEach(fruit ->{                   // to stream the content of hash table
            System.out.println(fruit);                         // print the fruit content of the hash table
        });

        boolean exit = false;
        do {
            Scanner scFruit = new Scanner(System.in);
            System.out.print("Type the fruit you like (or exit): ");
            String inputValue = scFruit.nextLine();

            if(inputValue.equalsIgnoreCase("exit")) {
                exit = true;
            } else {
                counter.add(inputValue);
            }
        }while (!exit);

        System.out.println("\nInputs: ");
        counter.getInputEntry().forEach(System.out::println);  // Print all the  entry from the scanner

        //to stream the content of hash table
        Map<String, Integer> fruitCount = counter.validate();
        System.out.println("\nFruit Count: ");
        fruitCount.forEach((key, value) ->{    //to stream the updated count/content of hash table
            System.out.println(key.toUpperCase() +": "+ value);
        });
    }
}
