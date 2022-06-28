package Week2.Examples.Java8Enhancement;
import java.util.Arrays;
import java.util.Random;
 
public class ParallelArraySortTimeTest {
 
    public static void main(String[] args) {
        int[] arraySizes = {10000, 100000, 1000000, 10000000};
        
        for(int arraySize : arraySizes ) {
            
            System.out.println("When Array size = "+arraySize);
            
            int[] intArray = new int[arraySize];
            Random random = new Random();
            
            for(int i=0; i < arraySize; i++)
                intArray[i] = random.nextInt(arraySize) + random.nextInt(arraySize);
            
            int[] forSequential = Arrays.copyOf(intArray, intArray.length);
            int[] forParallel = Arrays.copyOf(intArray, intArray.length);            
            
            
            long startTime = System.currentTimeMillis();
            Arrays.sort(forSequential);
            long endTime = System.currentTimeMillis();
            
            System.out.println("Sequential Sort Milli seconds: " + (endTime - startTime));
            
            startTime = System.currentTimeMillis();
            Arrays.parallelSort(forParallel);
            endTime = System.currentTimeMillis();
            
            System.out.println("Parallel Sort Milli seconds: " + (endTime - startTime));
            System.out.println("------------------------------");
        
        }
    }
}