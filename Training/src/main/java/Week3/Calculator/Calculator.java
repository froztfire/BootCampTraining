package Week3.Calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    //ADDITION METHOD
    public int add(int num1, int num2){
       return num1 + num2;
    }
    //SUBTRACTION METHOD
    public int subtract(int num1, int num2){
        return num1 - num2;
    }
    //MULTIPLICATION METHOD
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
    //DIVISION METHOD
    public int divide(int num1, int num2) {
        return num1 / num2;
    }
    //AVERAGE METHOD
    public Float average(List<Float> valuesToBeAvaraged){
        Float getAve = (float) ((valuesToBeAvaraged.stream().mapToInt(i -> i.intValue()).sum()) / valuesToBeAvaraged.size());
        return getAve;
    }
    public List<String> fizzBuzz(int n){
        List<String> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            if (i % 15 == 0){
                list.add("FizzBuzz");
            } else if ( i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}
