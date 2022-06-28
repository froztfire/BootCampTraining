package Practice;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.List;

public class WorkingWithList {
    public static void main(String[] args) {
        List<String> colors = new ArrayList();
        colors.add("Blue");
        colors.add("Purple");
        colors.add("Yellow");
        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.contains("Yellow"));
        System.out.println(colors.contains("pink"));


        //+++++++++++++++++ENHANCE FOR LOOP++++++++++++++++++++++++++++++++++//
        for (String color : colors) {
            System.out.println(color);
        }

        //+++++++++++++++++FOREACH in List++++++++++++++++++++++++++++++++++//
        colors.forEach(System.out::println);

        //+++++++++++++++++++HOW TO LOOP WITH YOUR LIST++++++++++++++++++++++//
        for (int i = 0; i < colors.size(); i++){
            System.out.println(colors.get(i));
        }
    }
}
