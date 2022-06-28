package Week2.Examples.Java8Enhancement;

import java.util.*;
import java.util.function.UnaryOperator;

public class ListReplaceAllExample{

     public static void main(String []args){
         
        List<String> list = new ArrayList<>(Arrays.asList("one", "two", "three", "four"));
        System.out.println(list);
        
        list.replaceAll(String::toUpperCase);
        System.out.println(list);
        
        list.replaceAll(new MyOperator());
        System.out.println(list);
     
         
     }
}

class MyOperator implements UnaryOperator<String> 
{
    @Override
    public String apply(String t) {
        return t.toLowerCase();
    }
}
