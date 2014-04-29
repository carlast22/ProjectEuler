import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumSquareDifferenceTest {

    @Test
    public void testShouldReturnSumOfTheSquaresNumbers() {
        SquareCalculator squareCalculator = new SquareCalculator();
        int squareNumber = squareCalculator.sumSquareOfNumber(10);
        assertEquals(385, squareNumber);
    }

    @Test
    public void testShouldSumTheNumbersAndCalculateTheSquareOfTheTotal() {
        SquareCalculator squareCalculator = new SquareCalculator();
        int squareTotalNumber = squareCalculator.calculateSquareOfTotal(10);
        assertEquals(3025, squareTotalNumber);
    }

    @Test
    public void testShouldSubtractTheSquareNumbersAndTheTotalSquare() {
        SquareCalculator squareCalculator = new SquareCalculator();
        int subtractSquares = squareCalculator.subtractSquaresTotals(10);
        assertEquals(2640, subtractSquares);
    }
}