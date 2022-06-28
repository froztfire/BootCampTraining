package Week2.FruitCounter;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FruitCounter {
    public Map<String, Integer> fruitCounter;
    ArrayList<String> inputEntry = new ArrayList<String>();         // ArrayList of inputEntry
    public FruitCounter() {
        fruitCounter = new LinkedHashMap<>();                       //Map Table
        fruitCounter.put("apple", 0);
        fruitCounter.put("banana", 0);
        fruitCounter.put("grape", 0);
        fruitCounter.put("pear", 0);
        fruitCounter.put("orange", 0);
    }
    public List<String> fruitList() {                               // Fruit list method to display
        return fruitCounter.entrySet().stream()                     // extract the map table to manipulate
                .map(fruit-> fruit.getKey())                        // map using lambda  to get the key elements of the hash table
                .toList();                                          // collect the mapped elements and convert to list
    }
    public void add(String input){                                  //"add" method for the arrayList of inputEntry
        inputEntry.add(input);
    }
    public Map<String, Integer> validate(){                         // validate method
        fruitCounter.entrySet().stream().forEach(fruit ->{          // extract the map table to manipulate , stream is to manipulate collection
            int count = inputEntry.stream()                         // stream the fruit array
                    //.map(s -> s.toLowerCase())                    // map it to upper case
                    .filter(s -> s.contentEquals(fruit.getKey()))   // filter the hash table if inputEntry is the equal to any content of it
                    .toList()                                       // convert to list
                    .size();                                        // filtered to size to get the fruit count
            fruit.setValue(count);                                  // set the fruit count
        });
        int totalFruitCount = 0;
        // count the number of fruit collected
        for (Map.Entry<String, Integer> fruit : fruitCounter.entrySet()) {
            totalFruitCount = totalFruitCount +  fruit.getValue();
        }
        // count of input entry  subtract by total fruit count is the invalid input
        fruitCounter.put("INVALID", inputEntry.size() - totalFruitCount);
        return fruitCounter;
    }
    public ArrayList<String> getInputEntry() {                      // getters arraylist of input fruits
        return inputEntry;
    }
}
