package Week3.Calculator;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    //GIVEN an input 5 and 5
    //WHEN a function is called
    //THEN the result will be 10
    @Test
    public void givenInputOf5And5ResultShouldBe10(){
        //ARRANGE
        int num1 = 5, num2 = 5;
        //ACT
        Calculator calculator = new Calculator();
        int actualSum = calculator.add(num1, num2);
        //ASSERT
        int expectedSum = 10;
        assertEquals(expectedSum, actualSum);
    }
    //GIVEN an input 5 and 5
    //WHEN a function is called
    //THEN the result will be 0
    @Test
    public void givenInputOf5And5ResultShouldBe0(){
        //ARRANGE
        int num1 = 5, num2 = 5;
        //ACT
        Calculator calculator = new Calculator();
        int actualDiff = calculator.subtract(num1, num2);
        //ASSERT
        int expectedDiff = 0;
        assertEquals(expectedDiff, actualDiff);
    }

    //GIVEN an input of 5 and 5
    //WHEN a function is called
    //THEN result should be 25
    @Test
    public void givenInputOf5And5ResultShouldBe25() {
        //ARRANGE
        int num1 = 5, num2 = 5;
        //ACT
        Calculator calculator = new Calculator();
        int actualProduct = calculator.multiply(num1, num2);
        //ASSERT
        int expectedProduct = 25;
        assertEquals(expectedProduct, actualProduct);
    }
    //GIVEN an input of 6 and 3
    //WHEN a function is called
    //THEN result should be 2
    @Test
    public void givenInputOf6And2ResultShouldBe3() {
        //ARRANGE
        int num1 = 6, num2 = 2;
        //ACT
        Calculator calculator = new Calculator();
        int actualQuotient = calculator.divide(num1, num2);
        //ASSERT
        int expectedQuotient = 3;
        assertEquals(expectedQuotient, actualQuotient);
    }
    //GIVEN an input of 1f, 2f and 3f
    //WHEN a function is called
    //THEN result should be 2f
    @Test
    public void testTheAverage(){
        //ARRANGE
        List<Float> numbers = List.of(1f, 2f, 3f);
        //ACT
        Calculator calculator = new Calculator();
        Float averageValue = calculator.average(numbers);
        //ASSERT
        Float expectedAverage = 2f;
        assertEquals(expectedAverage, averageValue);
    }

    //GIVEN an input of n
    //WHEN a function is called
    //THEN result should be FizzBuzz
    @Test
    public void fizzBuzz(){
        //ARRANGE
        int numbers = 15;
        //ACT
        Calculator calculator = new Calculator();
        List<String> value = calculator.fizzBuzz(numbers);
        //ASSERT
        List<String> expectedResult = List.of("FizzBuzz", "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14","FizzBuzz");
        assertEquals(expectedResult, value);
    }
}
