package Week2.Examples.Java8Enhancement;

import java.util.*;

public class IterableForEachExample{

     public static void main(String []args){
         
        List<String> strings = Arrays.asList("one", "two", "three");
        
        strings.forEach(System.out::println);
     
         
     }
}