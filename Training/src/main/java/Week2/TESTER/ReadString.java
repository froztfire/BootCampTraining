package Week2.TESTER;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReadString {

    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\jerome.garcia\\Documents\\JavaBootCamp\\Grocery\\stocks.csv");
        ArrayList<String> contentArray = new ArrayList<>();
        try {
            String content = Files.readString(path);
            String[] values = content.split(",");
            Arrays.stream(values).toArray();
            //System.out.println(values[0]);
            List<String> list = content.lines().toList();


            for (int i = 0; i < values.length; i++) {
                if (list.contains("Pantry")) {
                    System.out.println(list.get(i));
                }
            }




//            List<String> list = content.lines().toList();
//            String[] values = content.split(",");

//            for (String value : values) {
//               contentArray.add(value);
//            }
//            System.out.println(contentArray);
//            System.out.println(content);
//            System.out.println(content.split(","));
//            System.out.println(content);
//            for (int i = 0; i < list.size(); i++) {
//                if (!list.get(i).toString().equals(",,,")) {
//                   String[] str = list.get(i).toString().split("1");
//                   list2 = str.lines().collect(Collectors.toList());
//                  System.out.println(list2);
//                }
//            }
        }
        catch (Exception ignored){
        }
    }
}



//    Path filepath = Paths.get("C:/sample/testFile.txt");
//		try {
//                String content = Files.readString(filepath);
//                content.lines().forEach(System.out::println);
//                } catch (IOException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//                }
