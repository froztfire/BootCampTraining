package Week2.Grocery;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.prefs.Preferences;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainMenu {

    public static Map<String, String> productCategory() {
        Map<String, String> productCategory= new HashMap<String, String>();
        productCategory.put("1", "Pantry");
        productCategory.put("2", "Meat/Poultry/Seafood");
        productCategory.put("3", "Snacks");
        productCategory.put("-1", "-1");
        return productCategory;
    }

    public static void main(String[] args) {
        boolean exit = false;
        do {
            Path path = Paths.get("C:\\Users\\jerome.garcia\\Documents\\JavaBootCamp\\Grocery\\stocks.csv");
            Selection select = new Selection();
            select.category();
            Scanner input = new Scanner(System.in);
            String selectedCategory = input.next();

            if (selectedCategory.equals("-1")) {
                System.out.println("GoodBye!");
                exit = true;
            }
            try {
                String content = Files.readString(path);
                List<String> items = Arrays.asList(content.split("\\r\\n"));
                List<String[]> filteredItems = items.stream()
                        .filter(s -> s.endsWith(productCategory().get(selectedCategory)))
                        .map(s -> s.split(","))
                        .collect(Collectors.toList());
                AtomicInteger i=new AtomicInteger(-1);
                filteredItems.forEach(s -> {
                    System.out.println("[" + i.incrementAndGet() + "]" + s[0] + "  " + "price" + s[1] + "/" + s[2]);
                });
            } catch (IOException e) {
                throw new RuntimeException();
            } catch (ArrayIndexOutOfBoundsException e) {
                select.errorMessage();
            }
        }while (!exit);
    }
}

