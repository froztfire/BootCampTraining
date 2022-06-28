package Week2.Examples.Java8Enhancement;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStreamExample {
	public static void main(String[] args)
    {
		//Stream.of(val1, val2, val3�.)
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,6,7,8,9);
        stream1.forEach(p -> System.out.println(p));
        
        //Stream.of(arrayOfElements)
        Stream<Integer> stream2 = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
        stream2.forEach(p -> System.out.println(p));
        
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }

        //list.stream
        Stream<Integer> stream3 = list.stream();
        stream3.forEach(p -> System.out.println(p));
        
        //Stream.generate() or Stream.iterate()
       // Stream<Date> stream4 = Stream.generate(() -> { return new Date(); });
       // stream4.forEach(p -> System.out.println(p));
        
        //String chars
        Stream<String> stream5 = Stream.of("12345_abcdefg");
        stream5.forEach(p -> System.out.println(p));
    }
}
