import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialDigitSumTest {

    @Test
    public void testShouldCalculateTheFactorialOfTheNumber() {
        FactorialCalculator factorialCalculator = new FactorialCalculator();
        int factorialOfNumber = factorialCalculator.calculateFactorial(10);
        assertEquals(3628800, factorialOfNumber);
    }

    @Test
    public void testShouldCalculateTheSumOfTheDigitsInTheFactorialOfTheNumber() {
        FactorialCalculator factorialCalculator = new FactorialCalculator();
        int sumDigitsFactorial = factorialCalculator.sumDigitsOfFactorial(10);
        assertEquals(27, sumDigitsFactorial);
    }
}