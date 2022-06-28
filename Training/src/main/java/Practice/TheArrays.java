package Practice;

import java.util.Arrays;

public class TheArrays {

    public static void main(String[] args) {

        //+++++++++++++++++++HOW TO ASSIGN VALUE TO YOUR ARRAY++++++++++++++++++//

        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";
        System.out.println(Arrays.toString(colors));
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);
        colors[2] = "yellow";
        System.out.println(Arrays.toString(colors));

        int[] numbers = {100, 200};

        //+++++++++++++++++++HOW TO LOOP WITH YOUR ARRAYS++++++++++++++++++++++//
        System.out.println("//+++++++++++++++++++HOW TO LOOP WITH YOUR ARRAYS++++++++++++++++++++++//");

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }
        for (int i = colors.length -1; i >= 0; i-- ){
            System.out.println(colors[i]);
        }
        //+++++++++++++++++ENHANCE FOR LOOP++++++++++++++++++++++++++++++++++//
        System.out.println("//+++++++++++++++++ENHANCE FOR LOOP++++++++++++++++++++++++++++++++++//");
        for (String color :  colors){
            System.out.println(color);
        }
        //+++++++++++++++++Stream in Arrays++++++++++++++++++++++++++++++++++//
        System.out.println("//+++++++++++++++++STREAMS IN ARRAYS++++++++++++++++++++++++++++++++++//");
        Arrays.stream(colors).forEach(System.out::println);
    }
}
