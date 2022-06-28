package Week2.TESTER;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Grocery {

    public static void main(String[] args)   {
        List<Menu> menus = readMenuFromCSV("C:\\Users\\jerome.garcia\\Documents\\JavaBootCamp\\Grocery\\stocks.csv");
        for (Menu m : menus) {
            System.out.println(m); }
    }

    private static List<Menu> readMenuFromCSV(String fileName){
         List<Menu> menus = new ArrayList<>();
         Path pathToFile = Paths.get(fileName);

         try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)){
             String line = br.readLine();

             while (line != null) {
                 String[] attributes = line.split(",");
                 Menu menu = createMenu(attributes);
                 menus.add(menu);
                 line = br.readLine();
             }
         }
         catch (IOException ioe){
             ioe.printStackTrace();
         }
         return menus;
    }
    private static Menu createMenu(String[] metadata){
        String description = metadata[0];
        String price = metadata[1];
        String qty = metadata[2];
        String category = metadata[3];
        return new Menu(description, price, qty, category);
    }
}

class Menu {

    private String description;
    private String price;
    private String qty;
    private String category;

    public Menu(String description, String price, String qty, String category) {
        this.description = description;
        this.price = price;
        this.qty = qty;
        this.category = category;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", qty='" + qty + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}



