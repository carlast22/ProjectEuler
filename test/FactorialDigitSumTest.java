import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class FactorialDigitSumTest {

    @Test
    public void testShouldCalculateTheFactorialOfTheNumber() {
        FactorialCalculator factorialCalculator = new FactorialCalculator();
        BigInteger factorialOfNumber = factorialCalculator.calculateFactorial(10);
        assertEquals(BigInteger.valueOf(3628800), factorialOfNumber);
    }

    @Test
    public void testShouldCalculateTheSumOfTheDigitsInTheFactorialOfTheNumber() {
        FactorialCalculator factorialCalculator = new FactorialCalculator();
        BigInteger sumDigitsFactorial = factorialCalculator.sumDigitsOfFactorial(10);
        assertEquals(BigInteger.valueOf(27), sumDigitsFactorial);
    }
}