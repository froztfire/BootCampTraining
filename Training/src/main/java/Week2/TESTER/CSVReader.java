package Week2.TESTER;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    public static void main(String[] args) throws IOException {

        CSVReader test = new CSVReader();
        test.readData();
    }

    public List<String[]> readData() throws IOException {
        int count = 0;
        String file = "C:\\Users\\jerome.garcia\\Documents\\JavaBootCamp\\Grocery\\stocks.csv";
        List<String[]> content = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                System.out.println(content.add(line.split(",")));
            }
        } catch (FileNotFoundException e) {
            //Some error logging
        }
        return content;
    }
}
