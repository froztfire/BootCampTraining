package Week2.Examples.Java8Enhancement;

import java.util.*;

public class StringJoinerExample {  
	public static void main(String[] args) {  
	    
	  StringJoiner sj = new StringJoiner(", ");
	  sj.add("one").add("two").add("three");
	  System.out.println(sj.toString());        //one, two, three
	  
	  // joiner is empty
	  sj = new StringJoiner(", ", "{", "}");
	  System.out.println(sj.toString());        //{}
	  
	  String s = String.join(", ", "one", "two", "three");
	  System.out.println(s);                    //one, two, three
		
	}  
} 
