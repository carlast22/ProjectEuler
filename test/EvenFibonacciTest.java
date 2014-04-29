import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class EvenFibonacciTest {

    @Test
    public void testShouldCheckIfTheFibonacciNumberIsNotEven() {
        FibonacciNumber fibonacciNumber = new FibonacciNumber();
        boolean isEvenFibonacci = fibonacciNumber.checkIsEvenFibonacciNumber(1);
        assertEquals(false, isEvenFibonacci);
    }

    @Test
    public void testShouldCheckIfTheFibonacciIsEven() {
        FibonacciNumber fibonacciNumber = new FibonacciNumber();
        boolean isEvenFibonacci = fibonacciNumber.checkIsEvenFibonacciNumber(2);
        assertEquals(true, isEvenFibonacci);
    }

    @Test
    public void testShouldReturnTheFibonacciSequence() {
        FibonacciNumber fibonacciNumber = new FibonacciNumber();
        List<Integer> expectedFibonacciSequence = new ArrayList<Integer>();
        expectedFibonacciSequence.add(1);
        expectedFibonacciSequence.add(2);
        expectedFibonacciSequence.add(3);
        expectedFibonacciSequence.add(5);

        List<Integer> actualFibonacciSequence = fibonacciNumber.getFibonacciSequenceBelowLimit(6);
        assertArrayEquals(expectedFibonacciSequence.toArray(), actualFibonacciSequence.toArray());
    }

    @Test
    public void testShouldReturnTheSumOfAllFibonacciEvenNumbers() {
        FibonacciNumber fibonacciNumber = new FibonacciNumber();
        int sumEvenFibonacci = fibonacciNumber.sumAllEvenFibonacci(6);
        assertEquals(2, sumEvenFibonacci);
    }
}