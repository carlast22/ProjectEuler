import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class Multiples3and5Test {

    @Test
    public void testShouldCheckIfANumberIsMultipleOfThree() {
        MultipleChecker multipleChecker = new MultipleChecker();
        boolean isMultipleOfThreeOrFive = multipleChecker.checkIfNumberIsMultipleOfThreeOrFive(6);
        assertEquals(true, isMultipleOfThreeOrFive);
    }

    @Test
    public void testShouldCheckIfANumberIsNotMultipleOfThree() {
        MultipleChecker multipleChecker = new MultipleChecker();
        boolean isMultipleOfThreeOrFive = multipleChecker.checkIfNumberIsMultipleOfThreeOrFive(4);
        assertEquals(false, isMultipleOfThreeOrFive);
    }

    @Test
    public void testShouldCheckIfANumberIsMultipleOfFive() {
        MultipleChecker multipleChecker = new MultipleChecker();
        boolean isMultipleOfThreeOrFive = multipleChecker.checkIfNumberIsMultipleOfThreeOrFive(10);
        assertEquals(true, isMultipleOfThreeOrFive);
    } 

    @Test
    public void testShouldCheckIfANumberIsNotMultipleOfFive() {
        MultipleChecker multipleChecker = new MultipleChecker();
        boolean isMultipleOfThreeOrFive = multipleChecker.checkIfNumberIsMultipleOfThreeOrFive(2);
        assertEquals(false, isMultipleOfThreeOrFive);
    }

    @Test
    public void testShouldReturnTheSumOfAllMultiplesOfThreeAndFive() {
        MultipleChecker multipleChecker = new MultipleChecker();
        assertEquals(23, multipleChecker.sumMultiplesOfThreeAndFive(10));
    }


}