package Week3.Calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OperationServiceTest {
    @Mock
    InputGenerator inputGenerator;
    @InjectMocks
    Calculator2 calculator = new Calculator2(inputGenerator);
    private String exception;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    @DisplayName("GIVEN you have a file to read data and it returns 1,2,3 WHEN add is called THEN result 6")
    public void addition() {
        //arrange
        Mockito.when(inputGenerator.generate())
                .thenReturn(List.of("1", "2", "3"));
        //act
        int sum = calculator.add();
        //assert
        int expected = 6;
        assertEquals(expected, sum);
    }

    @Test
    @DisplayName("GIVEN you have a file to read data and it returns 10 3 and 2 WHEN sub is called THEN result 1")
    public void subtraction() {
        //arrange
        Mockito.when(inputGenerator.generate())
                .thenReturn(List.of("10", "3", "2"));
        //act
        int diff = calculator.subtract();
        //assert
        int expected = 5;
        assertEquals(expected, diff);
    }

    @Test
    @DisplayName("Given you have a file to read data and it returns 5, 6 and 7 WHEN multiply is called THEN result 210")
    public void multiplication() {
        //ARRANGE
        Mockito.when(inputGenerator.generate())
                .thenReturn(List.of("5", "6", "7"));
        //ACT
        int product = calculator.multiply();
        //ASSERT
        int expected = 210;
        assertEquals(expected, product);
    }

    @Test
    @DisplayName("Given you have a file to read data and it returns 5 and 5 WHEN divide is called THEN result 1")
    public void divide() {
        //ARRANGE
        Mockito.when(inputGenerator.generate())
                .thenReturn(List.of("5", "5"));
        //ACT
        int quotient = calculator.divide();
        //ASSERT
        int expected = 1;
        assertEquals(expected, quotient);
    }

    @Test
    @DisplayName("Given you have a file to read data and it returns 5, 5 and 5 WHEN average is called THEN result 5")
    public void average() {
        //ARRANGE
        Mockito.when(inputGenerator.generate())
                .thenReturn(List.of("5", "5", "5"));
        //ACT
        double average = calculator.average();
        //ASSERT
        double expected = 5;
        assertEquals(expected, average);
    }

    @Test
    @DisplayName("Given you have a file to read data and it returns 5 and 5 WHEN divide is called THEN result 1")
    public void divideByZero() {

        assertThrows(NumberFormatException.class, () -> {
            Mockito.when(inputGenerator.generate())
                    .thenReturn(List.of("5", "5", "0"));
            //ACT
            calculator.divide();
        });
    }
}

